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
    ) {
        // Handle a variable upadte

        String variableName = ctx.IDENTIFIER().getText();

        // Get given value (to assignate)
        Value evaluatedValue = Expression.evaluate(
                ctx.expression(),
                context,
                parentVisitor
        );


        // Check if given value matches type defined
        if (evaluatedValue == null) {
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
        if (variable == null) {
            // Variable does not exist
            Error.throwError(
                    "Variable \"" + variableName + "\" does not exist",
                    ctx
            );
            return 2;
        }

        // Set array type if its empty
        if( evaluatedValue.type == Variable.ARRAY && evaluatedValue.subtype == Variable.UNDEFINED ){
            evaluatedValue.subtype = variable.value.type == Variable.ARRAY ?
                    variable.value.subtype : variable.value.type;
        }

        Value value = variable.value;
        boolean evaluatedIsArray = evaluatedValue.type == Variable.ARRAY;
        boolean variableIsArray = value.type == Variable.ARRAY;

        // Check if they (any or both) are arrays but theirs subtypes are different
        int varID = variableIsArray ? variable.value.subtype : evaluatedValue.subtype;
        int expID = evaluatedIsArray ? evaluatedValue.subtype : value.subtype;

        // Check if they aren't arrays but anyway theirs type is different
        if (varID != expID) {
            Error.throwError(
                    "Target variable \"" + variableName + " \" and Expression should be of the same type",
                    ctx
            );
            return 3;
        }

        // Now check if this is an array accessor
        if (ctx.arrayitem() != null && ctx.arrayitem().getChildCount() > 0) {
            SMITHGrammarParser.ArrayaccessorContext arrayAccessor = ctx.arrayitem().arrayaccessor();

            // Check if this variable is an array actually

            if (value.type != Variable.ARRAY) {
                Error.throwError(
                        "Variable " + variableName + " is not an array",
                        ctx
                );
                return 5;
            }
            ArrayList<Value> array;

            // Process array accessor
            while (arrayAccessor != null && arrayAccessor.getChildCount() > 0) {

                // Check first if this variable is an array
                if( value.type != Variable.ARRAY ){
                    Error.throwError(
                            "Variable " + variableName + " is not an array at index " + arrayAccessor.getText(),
                            ctx
                    );
                    return 8;
                }

                array = (ArrayList<Value>) value.value;

                Value accessor = Expression.evaluate(
                        arrayAccessor.expression(),
                        context,
                        null
                );

                // Check if value is an integer
                if (accessor.type != Variable.INT) {
                    Error.throwError(
                            "Array accessor must be an integer",
                            arrayAccessor
                    );
                    return 6;
                }

                // Check if value is within bounds
                if ((int) accessor.value < 0 || (int) accessor.value >= array.size()) {
                    Error.throwError(
                            "Array accessor out of bounds",
                            arrayAccessor
                    );
                    return 7;
                }

                // Get item
                value = array.get((int) accessor.value);

                // Process a new Iterator for the array
                SMITHGrammarParser.FurtherarrayaccessorContext furtherArrayAccessor = arrayAccessor.furtherarrayaccessor();
                if (furtherArrayAccessor != null && furtherArrayAccessor.getChildCount() > 0) {
                    // If there is a further array accessor
                    arrayAccessor = furtherArrayAccessor.arrayaccessor();
                } else {
                    // If there is no further array accessor
                    // last accessor is where we want to set the value
                    array.set((int) accessor.value, evaluatedValue);
                    return 0;
                }
            }
        } else {
            // This is not an array accessor
            variable.value = evaluatedValue;
        }
        return 0;
    }
}
