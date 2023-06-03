package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Function;
import src.utils.Variable;

import java.util.HashMap;

public class DefineStatement {
    public static int getVariableType(SMITHGrammarParser.AtomictypeContext atomicType){
        if( atomicType.INT() != null ){
            return Variable.INT;
        } else if( atomicType.FLOAT() != null ){
            return Variable.FLOAT;
        } else if( atomicType.STRING() != null ){
            return Variable.STRING;
        } else if( atomicType.BOOL() != null ){
            return Variable.BOOLEAN;
        } else {
            // This should never happen
            return Variable.UNDEFINED;
        }
    }
    public static int handle(
            ContextManager context,
            SMITHGrammarParser.DefinestatementContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle variable declaration

        // Check variable type
        SMITHGrammarParser.DefineextensionContext defineExtension = ctx.defineextension();
        SMITHGrammarParser.AtomictypeContext atomicType = defineExtension.atomictype();

        // Get variable name
        String variableName = defineExtension.IDENTIFIER().getText();

        // Further logic applies to non-function variables only
        if( atomicType != null ){
            Value evaluatedValue;

            // Get given value (to assignate)
            SMITHGrammarParser.DefinedefaultvalueContext defaultValue = defineExtension.definedefaultvalue();

            // Check if there is an assignation or we should take a default value
            if( defaultValue != null && defaultValue.getChildCount() > 0) {
                // There is a value to be assignated
                // Evaluate it
                evaluatedValue = Expression.evaluate(
                        defaultValue.expression(),
                        context,
                        parentVisitor
                );
            }
            else {
                // Assignate a default value

                if (atomicType.INT() != null) {
                    evaluatedValue = new Value(0, Variable.INT);
                } else if (atomicType.FLOAT() != null) {
                    evaluatedValue = new Value(0.0, Variable.FLOAT);
                } else if (atomicType.STRING() != null) {
                    evaluatedValue = new Value("", Variable.STRING);
                } else if (atomicType.BOOL() != null) {
                    evaluatedValue = new Value(false, Variable.BOOLEAN);
                } else {
                    // This should never happen
                    return 1;
                }
            }

            // Check if variable is already defined
            if( context.searchVariable( variableName ) != null )
                return 2; // Variable already defined (error

            // Now define this variable
            Variable newVariable = new Variable(
                    variableName,
                    evaluatedValue.type
            );

            // Assignate value
            newVariable.setValue(evaluatedValue.value);

            // Add variable to context
            context.defineVariable( variableName, newVariable);

        } else {
            // This is a function case
            // No default value is supossed to be allowed around here
            SMITHGrammarParser.FunctiondefextensionContext functionDefExtension =
                    defineExtension.functiondefextension();

            // This is the return value of function
            atomicType = functionDefExtension.atomictype();

            int returnType = Variable.UNDEFINED;

            if( atomicType != null )
                returnType = getVariableType(atomicType);

            // Function instances will save they own definition block
            SMITHGrammarParser.FunctionblockContext functionBlock =
                    ctx.defineextension().functionblock();

            Function newFunction = new Function(
                    variableName,
                    returnType,
                    functionBlock
            );

            // Check if variable is already defined
            if( context.searchVariable( variableName ) != null )
                return 2; // Variable already defined (error

            // Now define this variable
            Variable newVariable = new Variable(
                    variableName,
                    Variable.FUNCTION
            );

            // Assignate value
            newVariable.setValue(newFunction);

            // Add variable to context
            context.defineVariable( variableName, newVariable);

            // Define function in context
            HashMap<String, Variable > functionContext = context.resumeContext();

            // Set context for this function
            newFunction.setContext(functionContext);
        }
        return 0;
    }
}
