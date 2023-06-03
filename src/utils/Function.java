package src.utils;

import src.gen.SMITHGrammarVisitor;
import src.utils.Statements.*;
import src.utils.ContextManager;
import java.util.*;
import src.gen.SMITHGrammarParser;
public class Function<T> extends Variable {

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
        public String type;

        public FunctionArg(String _name, String _type){
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
        super(_name, Variable.FUNCTION);
        this.ctx = _ctx;
        this.returnType = _returnType;

        // Construct a format for given arguments
        // they should match this body
        args = new ArrayList<>();
        SMITHGrammarParser.FunctionargumentsContext arguments = this.ctx.functionarguments();
        SMITHGrammarParser.ArgumentsContext argument = arguments.arguments();

        while( argument != null ){
            // While there are arguments, add them to list
            args.add(
                new FunctionArg(
                    argument.IDENTIFIER().getText(),
                    argument.type().getText()
                )
            );
        }

    }

    // Set context for this function
    public void setContext(HashMap<String, Variable> _context){
        this.ownedContext = _context;
    }

    // Method for revisiting this function
    public Object call(
            SMITHGrammarVisitor parentVisitor,
            SMITHGrammarParser.FunctionargumentsContext arguments
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

        // now define arguments in block

        context.pop();
        return null;
    }
}