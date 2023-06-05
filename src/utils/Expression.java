package src.utils;

import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.Expressions.*;
import src.utils.Expressions.AritmeticOperator;
import src.utils.Expressions.ParseType.*;
import src.utils.Statements.InputStatement;


import java.util.ArrayList;

public class Expression {
    public static int getLiteralType(
            SMITHGrammarParser.LiteralContext ctx,
            ContextManager context
    ) {
        if (ctx.BOOLEAN_LITERAL() != null) {
            return Variable.BOOLEAN;
        }
        if (ctx.STRING_LITERAL() != null) {
            return Variable.STRING;
        }
        if (ctx.numberliteral() != null) {
            if (ctx.numberliteral().FLOAT_LITERAL() != null) {
                return Variable.FLOAT;
            } else if (ctx.numberliteral().INTEGER_LITERAL() != null) {
                return Variable.INT;
            } else {
                return Variable.NUMBER;
            }
        }
        if (ctx.IDENTIFIER() != null) {
            // Check if identifier exists
            String variableName = ctx.IDENTIFIER().getText();
            Variable variable = context.searchVariable(variableName);

            if (variable == null) {
                // If variable does not exist
                Error.throwError(
                        "Variable " + variableName + " does not exist",
                        ctx
                );
                return -1;
            } else {
                // If variable exists
                return variable.value.type;
            }
        }
        if (ctx.arrayliteral() != null) {
            return Variable.ARRAY;
        }

        Error.throwError(
                "No valid literal type",
                ctx
        );
        return -1;
    }

    // Evaluate and get literal value
    public static Value evaluateLiteral(
            SMITHGrammarParser.LiteralContext literal,
            ContextManager context
    ) {
        // We are performing an operation directly

        // Get literal type

        if( literal.PI() != null ){
            return new Value( Math.PI, Variable.FLOAT );
        }
        if( literal.EULER() != null ){
            return new Value( Math.E, Variable.FLOAT );
        }
        if (literal.IDENTIFIER() != null) {
            // Check if identifier exists
            String variableName = literal.IDENTIFIER().getText();
            Variable variable = context.searchVariable(variableName);

            if (variable == null) {
                // If variable does not exist
                Error.throwError(
                        "Variable " + variableName + " does not exist",
                        literal
                );
                return null;
            }

            // Now check if this is an array accessor
            if (literal.arrayitem() != null && literal.arrayitem().getChildCount() > 0) {
                SMITHGrammarParser.ArrayaccessorContext arrayAccessor = literal.arrayitem().arrayaccessor();

                // Check if this variable is an array actually
                Value value = variable.value;
                if (value.type != Variable.ARRAY) {
                    Error.throwError(
                            "Variable " + variableName + " is not an array",
                            literal
                    );
                    return null;
                }
                ArrayList<Value> array;

                // Process array accessor
                while (arrayAccessor != null && arrayAccessor.getChildCount() > 0) {

                    // Check first if this variable is an array
                    if( value.type != Variable.ARRAY ){
                        Error.throwError(
                                "Variable " + variableName + " is not an array at index " + arrayAccessor.getText(),
                                literal
                        );
                        return null;
                    }
                    array = (ArrayList<Value>) value.value;

                    Value accessor = evaluate(
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
                        return null;
                    }

                    // Check if value is within bounds
                    if ((int) accessor.value < 0 || (int) accessor.value >= array.size()) {
                        Error.throwError(
                                "Array accessor out of bounds",
                                arrayAccessor
                        );
                        return null;
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
                        break;
                    }
                }

                return value;
            }

            // If variable exists
            return variable.value;

        }
        if (literal.functioncall() != null) {

            SMITHGrammarParser.FunctioncallContext functioncall = literal.functioncall();
            // Get function name
            String functionName = functioncall.IDENTIFIER().getText();

            // Handle built-in functions
            if (BuiltInFunctions.isBuiltInFunction(functionName)) {
                // Call built-in function
                return new Value(
                        BuiltInFunctions.callBuiltInFunction(
                                functionName, context, functioncall.functioncallarguments()
                        ),
                        Variable.FLOAT
                );
            }

            Variable var = context.searchVariable(functionName);
            if (var == null) {
                // Function not found
                Error.throwError(
                        "Function " + functionName + " does not exist",
                        literal
                );
                return null;
            }

            // Check if that var is a function
            Value varValue = var.value;
            if (varValue.type != Variable.FUNCTION) {
                // This is not a function
                Error.throwError(
                        "Function " + functionName + " does not exist",
                        literal
                );
                return null;
            }

            // Get actual function
            Function function = (Function) varValue;

            // call function
            function.call(
                    null,
                    context,
                    functioncall.functioncallarguments()
            );

            // Context now should have the return value, if any
            Value toReturn = context.getReturnValue();

            // Reset context return value
            context.setReturnValue(null);

            return toReturn;
        }
        if (literal.arrayliteral() != null) {
            // Evaluate array literal

            SMITHGrammarParser.ArrayelementsContext arrayElements = literal.arrayliteral().arrayelements();

            // Arrays will be represented as array lists containing values
            ArrayList<Value> values = new ArrayList<>();

            // We will check they type of the array on the way, like a pro :D
            int elementsType = Variable.UNDEFINED;

            // Useful for letting user know which index the error is at
            int index = 0;

            while (
                    arrayElements != null && arrayElements.getChildCount() > 0
            ) {
                // Get value
                Value value = evaluate(
                        arrayElements.expression(),
                        context,
                        null
                );

                if (value == null) {
                    Error.throwError(
                            "Invalid array element at item " + index + " of array",
                            arrayElements
                    );
                    return null;
                }


                // Check if type corresponds with given type
                if (elementsType == Variable.UNDEFINED) {
                    // Check if this is an array
                    if (value.type == Variable.ARRAY)
                        elementsType = value.subtype;
                    else
                        elementsType = value.type;
                } else if (value.type == Variable.ARRAY) {
                    // Check if this is an array
                    if (elementsType != value.subtype) {
                        // Type mismatch (Not all array elements are of the same type)
                        Error.throwError(
                                "Invalid array element at item " + index + " of array. All array elements must be of the same type",
                                arrayElements
                        );
                        return null;
                    }
                } else if (elementsType != value.type) {
                    // Type mismatch (Not all array elements are of the same type)
                    Error.throwError(
                            "Invalid array element at item " + index + " of array. All array elements must be of the same type",
                            arrayElements
                    );
                    return null;
                }

                // Add value to array
                values.add(value);

                // Get next element
                SMITHGrammarParser.FurtherarrayelementsContext furtherArrayElements =
                        arrayElements.furtherarrayelements();


                if (furtherArrayElements != null && furtherArrayElements.getChildCount() > 0) {
                    // Check if this is a shorthand array generator
                    if (furtherArrayElements.SEMICOLON(0) != null) {

                        // We can provide an interval for the array
                        Value interval = null;
                        if( furtherArrayElements.optionalinterval() != null &&
                                furtherArrayElements.optionalinterval().getChildCount() > 0 ) {

                            // Evaluate (if given) an interval between each pairs of elements in array
                            interval = evaluate(
                                    furtherArrayElements.optionalinterval().expression(),
                                    context,
                                    null
                            );

                            if (interval == null) {
                                Error.throwError(
                                        "Invalid array interval at item " + index + " of array",
                                        arrayElements
                                );
                                return null;
                            }
                        }

                        Value limitValue = evaluate(
                                furtherArrayElements.expression(),
                                context,
                                null
                        );

                        if (limitValue == null) {
                            Error.throwError(
                                    "Invalid array limit at item " + index + " of array",
                                    arrayElements
                            );
                            return null;
                        }


                        // Now value : interval : limitValue represent an array of values to be generated
                        // if possible, they must be integers, otherwise all of them are float values
                        // not this has direct implications over the type of the iterator, for example

                        boolean valueIsNumber = value.type == Variable.INT || value.type == Variable.FLOAT;
                        boolean intervalIsNumber = interval != null && (interval.type == Variable.INT || interval.type == Variable.FLOAT) ;
                        boolean limitIsNumber = limitValue.type == Variable.INT || limitValue.type == Variable.FLOAT;

                        if (
                            !valueIsNumber || !limitIsNumber || (interval != null && !intervalIsNumber)
                        ) {
                            Error.throwError(
                                    "Invalid shorthand array generator parameters, Limits must be numbers, if given, "+
                                        " interval should be one as well",
                                    arrayElements
                            );
                            return null;
                        }

                        // Get subtype for this array
                        elementsType = Variable.INT;
                        if(
                                limitValue.type == Variable.FLOAT ||
                                (interval != null && interval.type == Variable.FLOAT) ||
                                value.type == Variable.FLOAT
                        ) {
                            elementsType = Variable.FLOAT;
                        }

                        Value floatInterval = null ;
                        if( interval != null ){
                            floatInterval = ParseType.parseToNeededType(
                                    interval,
                                    Variable.FLOAT
                            );
                        }

                        Value floatValue = ParseType.parseToNeededType(
                                value,
                                Variable.FLOAT
                        );
                        Value floatLimitValue = ParseType.parseToNeededType(
                                limitValue,
                                Variable.FLOAT
                        );

                        // Finally generate an array with given limits
                        ArrayList<Value> generatedArray = new ArrayList<>();

                        double offset = interval != null ? (double) floatInterval.value : 1.0;

                        for (
                            double i = (double) floatValue.value;
                            i <= (double) floatLimitValue.value;
                            i += offset
                        ){
                            // Now parse to needed type each element of array
                            if( elementsType == Variable.INT ){
                               Integer val = (int) i;
                               generatedArray.add(
                                    new Value<>(
                                            val,
                                            elementsType
                                    )
                               );
                            } else {
                                generatedArray.add(
                                    new Value<>(
                                            i,
                                            elementsType
                                    )
                                );
                            }

                        }

                        // Add generated array to values
                        return new Value<>(
                                generatedArray,
                                Variable.ARRAY,
                                elementsType
                        );
                    }
                    arrayElements = furtherArrayElements.arrayelements();
                } else
                    break;

                index++;
            }

            // We have an array of elements, now we need to create an array (as a Value)
            // and return it
            return new Value<>(
                    values,
                    Variable.ARRAY,
                    elementsType
            );
        }
        int literalType = getLiteralType(literal, context);

        if (literalType == Variable.STRING) {
            // Remove " " from string
            String stringLiteral = literal.STRING_LITERAL().getText();
            stringLiteral = stringLiteral.substring(1, stringLiteral.length() - 1);
            return new Value<>(
                    stringLiteral,
                    Variable.STRING
            );
        }

        if (literalType == Variable.INT) {
            // Parse all numbers to double
            try {
                return new Value<>(
                        Integer.parseInt(literal.numberliteral().getText()),
                        Variable.INT
                );
            } catch (NumberFormatException e) {
                Error.throwError(
                        "Invalid integer literal",
                        literal
                );

                return null;
            }
        }

        if (literalType == Variable.FLOAT) {
            // Parse all numbers to double
            try {
                return new Value<>(
                        Double.parseDouble(literal.numberliteral().getText()),
                        Variable.FLOAT
                );
            } catch (NumberFormatException e) {
                Error.throwError(
                        "Invalid float literal",
                        literal
                );
                return null;
            }
        }

        if (literalType == Variable.BOOLEAN)
            return new Value<>(
                    Boolean.parseBoolean(literal.BOOLEAN_LITERAL().getText()),
                    Variable.BOOLEAN
            );

        Error.throwError(
                "Invalid integer literal",
                literal
        );

        return null;

    }

    public static Value evaluate(
            SMITHGrammarParser.ExpressionContext ctx,
            ContextManager context,
            SMITHGrammarVisitor parentVisitor
    ) {
        if( ctx == null )
            return null;
        // Handle expression and return appropriate value

        // Check on which kind of rule are we standing on

        // This time we got a direct value
        if (ctx.literal() != null) {
            return evaluateLiteral(ctx.literal(), context);
        }
        // Check if there are parenthesis
        if (ctx.OPEN_PAREN() != null) {
            return evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );
        }
        // Check if this a parse operator
        if (ctx.atomictype() != null) {
            // Parse one type to another, but first evaluate nested expression
            Value evaluated = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );

            if (evaluated == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            // Parse to other type
            SMITHGrammarParser.AtomictypeContext atomicType = ctx.atomictype();
            Value parsed;
            if (atomicType.BOOL() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.BOOLEAN
                );
            } else if (atomicType.INT() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.INT
                );
            } else if (atomicType.FLOAT() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.FLOAT
                );
            } else if (atomicType.STRING() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.STRING
                );
            } else {
                Error.throwError(
                        "Invalid type",
                        ctx
                );
                return null;
            }

            if (parsed == null) {
                Error.throwError(
                        "Couldn't parse to needed type",
                        ctx
                );
                return null;
            }

            return parsed;
        }
        // Check if this a minus (negation of an expression)
        if (ctx.MINUS() != null && ctx.getChildCount() == 2) {
            Value evaluated = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );

            if (evaluated == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }


            return AritmeticOperator.singleMinus(evaluated, ctx);
        }
        // Check if its an array concatenation
        if (ctx.TILDE() != null) {
            Value leftMost = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );
            Value rightMost = evaluate(
                    ctx.expression(1),
                    context,
                    parentVisitor
            );

            if (leftMost == null || rightMost == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            // Left operator must be always an array
            if (leftMost.type != Variable.ARRAY) {
                Error.throwError(
                        "Left operator must be always an array",
                        ctx
                );
                return null;
            }

            // Verify that given new item matches expected type
            if (rightMost.type != leftMost.subtype && rightMost.subtype != leftMost.subtype) {
                Error.throwError(
                        "Invalid type for array concatenation",
                        ctx
                );
                return null;
            }

            // Concatenate arrays
            ArrayList<Value> leftArray = (ArrayList<Value>) leftMost.value;
            leftArray.add(rightMost);
            return new Value(
                    leftArray,
                    Variable.ARRAY,
                    leftMost.subtype
            );
        }
        // Check if there is a comparison operator
        if (ctx.comparisonoperator() != null) {
            // have on mind that there are two expressionsnc trees
            Value rightMost = evaluateNonComparatorExp(
                    ctx.expressionnc(1),
                    context,
                    parentVisitor
            );

            Value leftMost = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if (rightMost == null || leftMost == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            return ComparisonOperator.evaluate(
                    leftMost,
                    rightMost,
                    ctx.comparisonoperator()
            );
        }
        // Check if this is an input expression
        if (ctx.inputblock() != null ){
            return InputStatement.handle(
                    context,
                    ctx.inputblock(),
                    parentVisitor
            );
        }

        // Check if there are aritmetic or logical expressions

        // Getting value for each operand

        Value rightMost = evaluate(
                ctx.expression(1),
                context,
                parentVisitor
        );
        Value leftMost = evaluate(
                ctx.expression(0),
                context,
                parentVisitor
        );

        if (rightMost == null || leftMost == null) {
            Error.throwError(
                    "Invalid expression",
                    ctx
            );
            return null;
        }

        if (ctx.TIMES() != null) {
            return AritmeticOperator.times(leftMost, rightMost, ctx);
        }
        if (ctx.DIVIDE() != null) {
            return AritmeticOperator.divide(leftMost, rightMost, ctx);
        }
        if (ctx.PLUS() != null) {
            return AritmeticOperator.sum(leftMost, rightMost, ctx);
        }
        if (ctx.MINUS() != null) {
            return AritmeticOperator.difference(leftMost, rightMost, ctx);
        }
        if (ctx.MOD() != null) {
            return AritmeticOperator.mod(leftMost, rightMost, ctx);
        }
        if (ctx.AND() != null) {
            return LogicalOperator.and(leftMost, rightMost, ctx);
        }
        if (ctx.OR() != null) {
            return LogicalOperator.or(leftMost, rightMost, ctx);
        }

        Error.throwError(
                "Invalid expression",
                ctx
        );
        return null;
    }

    public static Value evaluateNonComparatorExp(
            SMITHGrammarParser.ExpressionncContext ctx,
            ContextManager context,
            SMITHGrammarVisitor parentVisitor
    ) {
        // Handle expression and return appropriate value

        // Check on which kind of rule are we standing on

        // This time we got a direct value
        if (ctx.literal() != null) {
            return evaluateLiteral(ctx.literal(), context);
        }
        // Check if there are parenthesis
        if (ctx.OPEN_PAREN() != null) {
            return evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );
        }
        if (ctx.atomictype() != null) {
            // Parse one type to another, but first evaluate nested expression
            Value evaluated = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if (evaluated == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            // Parse to other type
            SMITHGrammarParser.AtomictypeContext atomicType = ctx.atomictype();
            Value parsed;
            if (atomicType.BOOL() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.BOOLEAN
                );
            } else if (atomicType.INT() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.INT
                );
            } else if (atomicType.FLOAT() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.FLOAT
                );
            } else if (atomicType.STRING() != null) {
                parsed = ParseType.parseToNeededType(
                        evaluated,
                        Variable.STRING
                );
            } else {
                Error.throwError(
                        "Invalid type",
                        ctx
                );
                return null;
            }

            if (parsed == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            return parsed;
        }
        // Check if this a minus (negation of an expression)
        if (ctx.MINUS() != null && ctx.getChildCount() == 2) {
            Value evaluated = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if (evaluated == null) {
                Error.throwError(
                        "Invalid expression",
                        ctx
                );
                return null;
            }

            return AritmeticOperator.singleMinus(evaluated, ctx);
        }
        // Check if this is an input expression
        if (ctx.inputblock() != null ){
            return InputStatement.handle(
                    context,
                    ctx.inputblock(),
                    parentVisitor
            );
        }
        // Check if there are aritmetic expressions


        // Getting value for each operand

        Value rightMost = evaluateNonComparatorExp(
                ctx.expressionnc(1),
                context,
                parentVisitor
        );
        Value leftMost = evaluateNonComparatorExp(
                ctx.expressionnc(0),
                context,
                parentVisitor
        );

        if (rightMost == null || leftMost == null) {
            Error.throwError(
                    "Invalid expression",
                    ctx
            );
            return null;
        }

        if (ctx.TIMES() != null) {
            return AritmeticOperator.times(leftMost, rightMost, ctx);
        }
        if (ctx.DIVIDE() != null) {
            return AritmeticOperator.divide(leftMost, rightMost, ctx);
        }
        if (ctx.PLUS() != null) {
            return AritmeticOperator.sum(leftMost, rightMost, ctx);
        }
        if (ctx.MINUS() != null) {
            return AritmeticOperator.difference(leftMost, rightMost, ctx);
        }
        if (ctx.MOD() != null) {
            return AritmeticOperator.mod(leftMost, rightMost, ctx);
        }
        if (ctx.AND() != null) {
            return LogicalOperator.and(leftMost, rightMost, ctx);
        }
        if (ctx.OR() != null) {
            return LogicalOperator.or(leftMost, rightMost, ctx);
        }

        Error.throwError(
                "Invalid expression",
                ctx
        );
        return null;
    }
}