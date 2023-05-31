package src.utils.Expressions;

import src.gen.SMITHGrammarParser;
import src.utils.Variable;

public class AritmeticOperator {


    public static Value evaluate(
            Value leftMost, Value rightMost,
            SMITHGrammarParser.AritmeticoperatorContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
           ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        // Division is always a float
        if( ctx.DIVIDE() != null && betweenNumbers ){
            Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
            if( r == null || (Double) r.value == 0.0 )
                return null;
            rightMost = r;

            Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
            if( l == null )
                return null;
            leftMost = l;

            return new Value<> (
                    (Double) leftMost.value / (Double) rightMost.value,
                    Variable.FLOAT
            );
        }

        if( ctx.PLUS() != null ){
            // Check if we are concatenating strings (any of both is string)
            if(
                leftMost.type == Variable.STRING ||
                rightMost.type == Variable.STRING
            ){
                Value r = ParseType.parseToNeededType( rightMost, Variable.STRING );
                if( r == null )
                    return null;
                rightMost = r;

                Value l = ParseType.parseToNeededType( leftMost, Variable.STRING );
                if( l == null )
                    return null;
                leftMost = l;

                return new Value<> (
                        (String) leftMost.value + (String) rightMost.value,
                        Variable.STRING
                );
            } else if(
                !anyIsFloat && betweenNumbers
            ){
                // We are working with integers
                return new Value<> (
                        (Integer) leftMost.value + (Integer) rightMost.value,
                        Variable.INT
                );
            } else if( betweenNumbers ){
                // We are working with floats
                Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
                if( r == null )
                    return null;
                rightMost = r;

                Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
                if( l == null )
                    return null;
                leftMost = l;

                return new Value<> (
                        (Double) leftMost.value + (Double) rightMost.value,
                        Variable.FLOAT
                );
            }
        }

        if( ctx.MINUS() != null && betweenNumbers ){
            if( anyIsFloat ){
                // We are working with floats
                Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
                if( r == null )
                    return null;
                rightMost = r;

                Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
                if( l == null )
                    return null;
                leftMost = l;

                return new Value<> (
                        (Double) leftMost.value - (Double) rightMost.value,
                        Variable.FLOAT
                );
            } else {
                // We are working with integers
                return new Value<> (
                        (Integer) leftMost.value - (Integer) rightMost.value,
                        Variable.INT
                );
            }
        }

        if( ctx.TIMES() != null && betweenNumbers ){
            if( anyIsFloat ){
                // We are working with floats
                Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
                if( r == null )
                    return null;
                rightMost = r;

                Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
                if( l == null )
                    return null;
                leftMost = l;

                return new Value<> (
                        (Double) leftMost.value * (Double) rightMost.value,
                        Variable.FLOAT
                );
            } else {
                // We are working with integers
                return new Value<> (
                        (Integer) leftMost.value * (Integer) rightMost.value,
                        Variable.INT
                );
            }
        }

        if( ctx.MOD() != null && betweenNumbers && !anyIsFloat ){
            // We are working with integers
            return new Value<> (
                    (Integer) leftMost.value % (Integer) rightMost.value,
                    Variable.INT
            );
        }

        return null;
    }
}
