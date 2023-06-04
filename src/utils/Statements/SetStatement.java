package src.utils.Statements;

import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.*;
import src.utils.Error;
import src.utils.Expressions.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class SetStatement {
    public static int handle(
            ContextManager context,
            SMITHGrammarParser.SetstatementContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle a variable upadte

        String variableName = ctx.IDENTIFIER().getText();

        // Get given value (to assignate)
        Value evaluatedValue = Expression.evaluate(
                ctx.expression(),
                context,
                parentVisitor
        );

        // Check if given value matches type defined
        if( evaluatedValue == null ){
            // Error evaluating expression
            Error.throwError(
                    "Invalid expression",
                    ctx
            );
            return 1;
        }

        // Get variable to edit

        Variable variable = context.searchVariable(variableName);

        // Check if variable exists
        if( variable == null ){
            // Variable does not exist
            Error.throwError(
                    "Variable \"" + variableName + "\" does not exist",
                    ctx
            );
            return 2;
        }

        // Check if variable does not match type
        Value varValue = variable.value;
        if( varValue.type != evaluatedValue.type ){
            // Type mismatch

            Error.throwError(
                "Target variable \"" + variableName + "\"and Expression should be of the same type",
                ctx
            );
            return 3;
        }

        // Check if variable is an array and subtype does not match
        if( varValue.type == Variable.ARRAY ){
            if( varValue.subtype != evaluatedValue.subtype ){
                // Subtype mismatch
                Error.throwError(
                        "Target variable \"" + variableName + "\"and Expression should be of the same subtype",
                        ctx
                );
                return 4;
            }
        }

        // Update variable value
        variable.value = evaluatedValue;

        return 0;
    }
}
