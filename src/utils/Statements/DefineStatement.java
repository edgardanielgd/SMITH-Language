package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Variable;

public class DefineStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.DefinestatementContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle variable declaration

        // Check variable type
        SMITHGrammarParser.DefineextensionContext variableType = ctx.defineextension();
        SMITHGrammarParser.AtomictypeContext atomicType = variableType.atomictype();

        // Get variable name
        String variableName = ctx.IDENTIFIER().getText();

        // Get given value (to assignate)
        SMITHGrammarParser.DefinedefaultvalueContext defaultValue = ctx.definedefaultvalue();

        Value evaluatedValue = null;

        // Check if there is an assignation or we should take a default value
        if( defaultValue != null && defaultValue.getChildCount() > 0) {
            // There is a value to be assignated
            // Evaluate it
            evaluatedValue = Expression.evaluate(
                    defaultValue.assignationexp().expression(),
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

        // Now define this variable
        Variable newVariable = new Variable(
                variableName,
                evaluatedValue.type
        );

        // Assignate value
        newVariable.setValue(evaluatedValue.value);

        // Check if variable is already defined
        if( context.searchVariable( variableName ) != null )
            return 2; // Variable already defined (error


        // Add variable to context
        context.defineVariable( variableName, newVariable);
        return 0;
    }
}
