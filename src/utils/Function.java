package src.utils;

import src.gen.SMITHGrammarVisitor;
import src.utils.Expressions.Value;
import src.utils.Statements.*;
import src.utils.ContextManager;
import java.util.*;
import src.gen.SMITHGrammarParser;
public class Function extends Value {

    int returnType; // Its a Variable type

    // Functions must have a custom context that has been sliced from original context
    // and contains all variables defined before creating this function

    // Now, we will create a new context block each time this function is called
    // The main block will have this definitions, then create a new block and
    // define arguments, from this level we start the fun!
    HashMap<String, Variable> ownedContext;

    // We would save function parse tree here
    // and revisit for each function call
    SMITHGrammarParser.FunctionblockContext ctx;

    // Save a list of arguments this function is supossed to get
    private class FunctionArg {
        public String name;
        public int type;

        public FunctionArg(String _name, int _type){
            this.name = _name;
            this.type = _type;
        }
    }
    ArrayList<FunctionArg> args;

    // Context must be given lately in order to allow recursion
    public Function(
        String _name,
        int _returnType,
        SMITHGrammarParser.FunctionblockContext _ctx
    ){
        super(_name, Variable.FUNCTION );
        this.ctx = _ctx;
        this.returnType = _returnType;

        // Construct a format for given arguments
        // they should match this body
        args = new ArrayList<>();
        SMITHGrammarParser.FunctionargumentsContext arguments = this.ctx.functionarguments();
        SMITHGrammarParser.ArgumentsContext argument = arguments.arguments();
        SMITHGrammarParser.FurtherargumentsContext furtherarguments;

        // Collect all of given arguments
        while( argument != null && argument.getChildCount() > 0 ){
            // While there are arguments, add them to list
            String argName = argument.IDENTIFIER().getText();
            SMITHGrammarParser.AtomictypeContext argType = argument.atomictype();
            args.add(
                new FunctionArg(
                    argName,
                    ParseAtomicType.getVariableType(argType)
                )
            );

            // Advance in arguments list
            furtherarguments = argument.furtherarguments();
            argument = furtherarguments.arguments();
        }

    }

    // Set context for this function
    public void setContext(HashMap<String, Variable> _context){
        this.ownedContext = _context;
    }

    // Method for revisiting this function
    // Returns status of the operation
    // Result will be saved in given context
    public int call(
            SMITHGrammarVisitor parentVisitor,
            ContextManager givenContext,
            SMITHGrammarParser.FunctioncallargumentsContext callarguments
    ){
        // Handle function call

        // First than all, create a new Context Manager for further instructions
        ContextManager context = new ContextManager();
        context.insideFunction = true;

        // Creating default block
        context.stack.push( this.ownedContext );

        // now, push a new block for variables defined
        // in this function call
        context.push();

        // now define arguments in block, also check if they
        // match expected arguments
        SMITHGrammarParser.CallargumentsContext callargument = callarguments.callarguments();
        SMITHGrammarParser.FurthercallargumentsContext furthercallarguments;

        // Iterator for arguments
        int argIterator = 0;
        while( callargument != null && callargument.getChildCount() > 0 ){

            // Check if we got more params than the expected length
            if( argIterator >= args.size() ){
                // We got more params than expected
                return 1;
            }

            Value evaluatedValue = Expression.evaluate(
                    callargument.expression(),
                    givenContext,
                    parentVisitor
            );

            // Check if given value matches expected type
            if( evaluatedValue.type != args.get(argIterator).type ){
                // Type mismatch
                return 1;
            }



            // Define argument in context
            context.defineVariable(
                    args.get(argIterator).name,
                    new Variable(
                            args.get(argIterator).name,
                            evaluatedValue
                    )
            );

            System.out.println("Argument: " + args.get(argIterator).name + " = " + evaluatedValue.value);

            // Advance in arguments list
            furthercallarguments = callargument.furthercallarguments();
            callargument = furthercallarguments.callarguments();

            // Advance in argument iterator
            argIterator++;
        }

        // Now call function body

        BlockHandler.handle(
                this.ctx.statementbody().block(),
                context,
                parentVisitor
        );

        // Check if our own context got a milagrous return value
        if( context.returnValue != null ){
            // We got a return value
            // Check if it matches expected type
            if( context.returnValue.type != this.returnType ){
                // Type mismatch
                return 1;
            }

            // Save return value in given context
            givenContext.returnValue = context.returnValue;

        }

        context.pop();
        return 0;
    }
}