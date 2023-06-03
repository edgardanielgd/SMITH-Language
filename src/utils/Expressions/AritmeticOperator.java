package src.utils.Expressions;

import src.gen.SMITHGrammarParser;
import src.utils.Variable;

public class AritmeticOperator {

    public static Value sum(
            Value leftMost, Value rightMost
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );
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
        return null;
    }

    public static Value divide(
            Value leftMost, Value rightMost
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers )
            return null;

        Value r = ParseType.parseToNeededType(rightMost, Variable.FLOAT);
        if (r == null || (Double) r.value == 0.0)
            return null;
        rightMost = r;

        Value l = ParseType.parseToNeededType(leftMost, Variable.FLOAT);
        if (l == null)
            return null;
        leftMost = l;

        return new Value<>(
                (Double) leftMost.value / (Double) rightMost.value,
                Variable.FLOAT
        );
    }

    public static Value difference(
            Value leftMost, Value rightMost
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers )
            return null;

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
    }

    public static Value singleMinus(
            Value value
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = value.type == Variable.FLOAT;
        boolean betweenNumbers = (
                value.type == Variable.INT || value.type == Variable.FLOAT
        );

        if( !betweenNumbers )
            return null;

        Value v = ParseType.parseToNeededType( value, Variable.FLOAT );
        if( v == null )
            return null;
        value = v;

        return new Value<> (
                - (Double) value.value,
                Variable.FLOAT
        );
    }

    public static Value times(
            Value leftMost, Value rightMost
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if (!betweenNumbers)
            return null;

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

    public static Value mod(
            Value leftMost, Value rightMost
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers || anyIsFloat )
            return null;

        return new Value<> (
                (Integer) leftMost.value % (Integer) rightMost.value,
                Variable.INT
        );
    }

}
