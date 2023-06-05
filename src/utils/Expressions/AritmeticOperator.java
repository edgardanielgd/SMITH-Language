package src.utils.Expressions;

import org.antlr.v4.runtime.ParserRuleContext;
import src.gen.SMITHGrammarParser;
import src.utils.Error;
import src.utils.Variable;

import java.util.ArrayList;

import static src.utils.Expressions.ParseType.typeToString;

public class AritmeticOperator {

    public static Value sum(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );
        // Check if we are concatenating strings (Both are strings)
        if(
                leftMost.type == Variable.STRING &&
                rightMost.type == Variable.STRING
        ){
            Value r = ParseType.parseToNeededType( rightMost, Variable.STRING );
            if( r == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(rightMost.type) + " to " +
                                typeToString(Variable.STRING),
                        ctx
                );
                return null;
            }

            rightMost = r;

            Value l = ParseType.parseToNeededType( leftMost, Variable.STRING );
            if( l == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(leftMost.type) + " to " +
                                typeToString(Variable.STRING),
                        ctx
                );
                return null;
            }

            leftMost = l;

            return new Value<> (
                    (String) leftMost.value + (String) rightMost.value,
                    Variable.STRING
            );
        }

        if(
                !anyIsFloat && betweenNumbers
        ){
            // We are working with integers
            return new Value<> (
                    (Integer) leftMost.value + (Integer) rightMost.value,
                    Variable.INT
            );
        }

        if( betweenNumbers ){
            // We are working with floats
            Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
            if( r == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(rightMost.type) + " to " +
                                typeToString(Variable.FLOAT),
                        ctx
                );
                return null;
            }
            rightMost = r;

            Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
            if( l == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(leftMost.type) + " to " +
                                typeToString(Variable.FLOAT),
                        ctx
                );
                return null;
            }
            leftMost = l;

            return new Value<> (
                    (Double) leftMost.value + (Double) rightMost.value,
                    Variable.FLOAT
            );
        }

        if(
                leftMost.type == Variable.ARRAY ||
                rightMost.type == Variable.ARRAY
        ) {
            // Sum arrays by summing each element

            // Check which operator is an array
            boolean leftIsArray = leftMost.type == Variable.ARRAY;
            boolean rightIsArray = rightMost.type == Variable.ARRAY;

            ArrayList<Value> leftArray = null;
            ArrayList<Value> rightArray = null;

            // Convert to array if needed
            if (leftIsArray)
                leftArray = (ArrayList<Value>) leftMost.value;
            if (rightIsArray)
                rightArray = (ArrayList<Value>) rightMost.value;

            // If both are arrays, check if they are of the same size
            if (leftIsArray && rightIsArray && leftArray.size() != rightArray.size()){
                Error.throwError(
                        "Cannot sum arrays of different sizes",
                        ctx
                );
                return null;
            }

            // Check if subtypes are consistent
            int leftType = leftIsArray ? leftMost.subtype : leftMost.type;
            int rightType = rightIsArray ? rightMost.subtype : rightMost.type;
            boolean lIsNumber = leftType == Variable.INT || leftType == Variable.FLOAT;
            boolean rIsNumber = rightType == Variable.INT || rightType == Variable.FLOAT;

            anyIsFloat = leftType == Variable.FLOAT || rightType == Variable.FLOAT;

            if (
                    !lIsNumber && !rIsNumber &&
                    leftMost.subtype != rightMost.type &&
                    leftMost.type != rightMost.subtype
            ){
                Error.throwError(
                        "Cannot sum arrays of different types",
                        ctx
                );
                return null;
            }

            ArrayList<Value> result = new ArrayList<>();

            for (int i = 0; i < leftArray.size(); i++) {
                Value sum = sum(
                        leftIsArray ? leftArray.get(i) : leftMost,
                        rightIsArray ? rightArray.get(i) : rightMost,
                        ctx
                );
                if (sum == null){
                    Error.throwError(
                            "Cannot sum " +
                                    typeToString(leftMost.type) + " and " +
                                    typeToString(rightMost.type),
                            ctx
                    );
                    return null;
                }

                result.add(sum);
            }

            int newSubtype = Variable.UNDEFINED;

            // Get new array type
            if (lIsNumber && rIsNumber) {
                if (anyIsFloat)
                    newSubtype = Variable.FLOAT;
                else
                    newSubtype = Variable.INT;
            } else {
                newSubtype = leftMost.subtype;
            }

            return new Value<>(
                    result,
                    Variable.ARRAY,
                    newSubtype
            );
        }

        Error.throwError(
                "Cannot sum " +
                        typeToString(leftMost.type) + " and " +
                        typeToString(rightMost.type),
                ctx
        );

        return null;
    }

    public static Value divide(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers ){
            Error.throwError(
                    "Cannot divide " +
                            typeToString(leftMost.type )+ " and " +
                            typeToString(rightMost.type),
                    ctx
            );
            return null;
        }

        Value r = ParseType.parseToNeededType(rightMost, Variable.FLOAT);
        if (r == null || (Double) r.value == 0.0){
            Error.throwError(
                    "Cannot divide by zero",
                    ctx
            );
            return null;
        }
        rightMost = r;

        Value l = ParseType.parseToNeededType(leftMost, Variable.FLOAT);
        if (l == null){
            Error.throwError(
                    "Cannot convert " +
                            typeToString(leftMost.type) + " to " +
                            typeToString(Variable.FLOAT),
                    ctx
            );
            return null;
        }
        leftMost = l;

        return new Value<>(
                (Double) leftMost.value / (Double) rightMost.value,
                Variable.FLOAT
        );
    }

    public static Value difference(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ) {
        if(
                leftMost.type == Variable.ARRAY ||
                rightMost.type == Variable.ARRAY
        ) {
            // Sum arrays by summing each element

            // Check which operator is an array
            boolean leftIsArray = leftMost.type == Variable.ARRAY;
            boolean rightIsArray = rightMost.type == Variable.ARRAY;

            ArrayList<Value> leftArray = null;
            ArrayList<Value> rightArray = null;

            // Convert to array if needed
            if (leftIsArray)
                leftArray = (ArrayList<Value>) leftMost.value;
            if (rightIsArray)
                rightArray = (ArrayList<Value>) rightMost.value;

            // If both are arrays, check if they are of the same size
            if (leftIsArray && rightIsArray && leftArray.size() != rightArray.size()){
                Error.throwError(
                        "Cannot subtract arrays of different sizes",
                        ctx
                );
                return null;
            }

            // Check if subtypes are consistent
            int leftType = leftIsArray ? leftMost.subtype : leftMost.type;
            int rightType = rightIsArray ? rightMost.subtype : rightMost.type;
            boolean lIsNumber = leftType == Variable.INT || leftType == Variable.FLOAT;
            boolean rIsNumber = rightType == Variable.INT || rightType == Variable.FLOAT;

            boolean anyIsFloat = leftType == Variable.FLOAT || rightType == Variable.FLOAT;

            if (!lIsNumber && !rIsNumber && leftMost.subtype != rightMost.subtype){
                Error.throwError(
                        "Cannot subtract " +
                                typeToString(leftMost.type) + " and " +
                                typeToString(rightMost.type),
                        ctx
                );
                return null;
            }

            ArrayList<Value> result = new ArrayList<>();

            for (int i = 0; i < leftArray.size(); i++) {
                Value sum = difference(
                        leftIsArray ? leftArray.get(i) : leftMost,
                        rightIsArray ? rightArray.get(i) : rightMost,
                        ctx
                );
                if (sum == null){
                    Error.throwError(
                            "Cannot subtract " +
                                    typeToString(leftMost.type) + " and " +
                                    typeToString(rightMost.type),
                            ctx
                    );
                    return null;
                }

                result.add(sum);
            }

            int newSubtype = Variable.UNDEFINED;

            // Get new array type
            if (lIsNumber && rIsNumber) {
                if (anyIsFloat)
                    newSubtype = Variable.FLOAT;
                else
                    newSubtype = Variable.INT;
            } else {
                newSubtype = leftMost.subtype;
            }

            return new Value<>(
                    result,
                    Variable.ARRAY,
                    newSubtype
            );
        }

        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers ){
            Error.throwError(
                    "Cannot subtract " +
                            typeToString(leftMost.type )+ " and " +
                            typeToString(rightMost.type),
                    ctx
            );
            return null;
        }

        if( anyIsFloat ){
            Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
            if( r == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(rightMost.type) + " to " +
                                typeToString(Variable.FLOAT),
                        ctx
                );
                return null;
            }
            rightMost = r;

            Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
            if( l == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(leftMost.type) + " to " +
                                typeToString(Variable.FLOAT),
                        ctx
                );
                return null;
            }
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

    public static Value singleMinus(
            Value value,
            ParserRuleContext ctx
    ) {

        // Check if this is an array
        if( value.type == Variable.ARRAY ){
            boolean isNumber = (
                    value.subtype == Variable.INT || value.subtype == Variable.FLOAT
            );

            if( !isNumber ){
                Error.throwError(
                        "Cannot perform unary minus on " +
                                typeToString( value.subtype ),
                        ctx
                );
                return null;
            }

            ArrayList<Value> array = (ArrayList<Value>) value.value;
            ArrayList<Value> result = new ArrayList<>();

            for( Value v : array ){
                Value minus = singleMinus( v, ctx );
                if( minus == null ){
                    Error.throwError(
                            "Cannot perform unary minus on " +
                                    typeToString( value.subtype ),
                            ctx
                    );
                    return null;
                }
                result.add( minus );
            }

            return new Value<>(
                    result,
                    Variable.ARRAY,
                    value.subtype
            );
        }

        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean isNumber = (
                value.type == Variable.INT || value.type == Variable.FLOAT
        );

        if( !isNumber ){
            Error.throwError(
                    "Cannot perform unary minus on " +
                            typeToString( value.type ),
                    ctx
            );
            return null;
        }
        if( value.type == Variable.INT )
            return new Value<> (
                    - (Integer) value.value,
                    Variable.INT
            );

        return new Value<> (
                - (Double) value.value,
                Variable.FLOAT
        );
    }

    public static Value times(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ) {
        if(
                leftMost.type == Variable.ARRAY ||
                rightMost.type == Variable.ARRAY
        ) {
            // Sum arrays by summing each element

            // Check which operator is an array
            boolean leftIsArray = leftMost.type == Variable.ARRAY;
            boolean rightIsArray = rightMost.type == Variable.ARRAY;

            ArrayList<Value> leftArray = null;
            ArrayList<Value> rightArray = null;

            // Convert to array if needed
            if (leftIsArray)
                leftArray = (ArrayList<Value>) leftMost.value;

            if (rightIsArray)
                rightArray = (ArrayList<Value>) rightMost.value;

            // Check if subtypes are consistent
            int leftType = leftIsArray ? leftMost.subtype : leftMost.type;
            int rightType = rightIsArray ? rightMost.subtype : rightMost.type;
            boolean lIsNumber = leftType == Variable.INT || leftType == Variable.FLOAT;
            boolean rIsNumber = rightType == Variable.INT || rightType == Variable.FLOAT;
            boolean anyIsFloat = leftType == Variable.FLOAT || rightType == Variable.FLOAT;
            int newSubtype;

            // Get new array type
            if (lIsNumber && rIsNumber) {
                if (anyIsFloat)
                    newSubtype = Variable.FLOAT;
                else
                    newSubtype = Variable.INT;
            } else {
                newSubtype = leftMost.subtype;
            }

            if (!lIsNumber && !rIsNumber && leftMost.subtype != rightMost.subtype){
                Error.throwError(
                        "Cannot multiply arrays of different types",
                        ctx);
                return null;
            }


            // Multiply matrices by multiplying each element
            if( leftIsArray && rightIsArray ){
                return multiplyMatrices( leftArray, rightArray, newSubtype, ctx );
            }

            ArrayList<Value> result = new ArrayList<>();

            for (int i = 0; i < leftArray.size(); i++) {
                Value sum = times(
                        leftIsArray ? leftArray.get(i) : leftMost,
                        rightIsArray ? rightArray.get(i) : rightMost,
                        ctx
                );
                if (sum == null){
                    Error.throwError(
                            "Cannot multiply " +
                                    typeToString(leftMost.type) + " by " +
                                    typeToString(rightMost.type),
                            ctx
                    );
                    return null;
                }

                result.add(sum);
            }

            return new Value<>(
                    result,
                    Variable.ARRAY,
                    newSubtype
            );
        }

        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if (!betweenNumbers){
            Error.throwError(
                    "Cannot multiply " +
                            typeToString(leftMost.type) + " by " +
                            typeToString(rightMost.type),
                    ctx
            );
            return null;
        }

        if( anyIsFloat ){
            // We are working with floats
            Value r = ParseType.parseToNeededType( rightMost, Variable.FLOAT );
            if( r == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(rightMost.type) + " to " +
                                typeToString(Variable.FLOAT)
                        , ctx
                );
                return null;
            }
            rightMost = r;

            Value l = ParseType.parseToNeededType( leftMost, Variable.FLOAT );
            if( l == null ){
                Error.throwError(
                        "Cannot convert " +
                                typeToString(leftMost.type) + " to " +
                                typeToString(Variable.FLOAT)
                        , ctx
                );
                return null;
            }
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
            Value leftMost, Value rightMost,
            ParserRuleContext ctx

    ) {
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean anyIsFloat = leftMost.type == Variable.FLOAT || rightMost.type == Variable.FLOAT;
        boolean betweenNumbers = (
                leftMost.type == Variable.INT || leftMost.type == Variable.FLOAT
        ) && (
                rightMost.type == Variable.INT || rightMost.type == Variable.FLOAT
        );

        if( !betweenNumbers || anyIsFloat ){
            Error.throwError(
                    "Cannot use modulo on " +
                            typeToString(leftMost.type) + " and " +
                            typeToString(rightMost.type)
                    , ctx
            );
            return null;
        }

        return new Value<> (
                (Integer) leftMost.value % (Integer) rightMost.value,
                Variable.INT
        );
    }


    // Util for multiplying matrices
    public static Value multiplyMatrices(
            ArrayList<Value> left, ArrayList<Value> right,
            int newSubtype, ParserRuleContext ctx
    ) {
        // Check if we are able to multiply matrices
        int lFirstDimension = left.size();
        int rFirstDimension = right.size();

        if( lFirstDimension == 0 || rFirstDimension == 0 ){
            Error.throwError(
                    "Cannot multiply matrices of size 0",
                    ctx
            );
            return null;
        }

        // Getting second dimensions
        Value lSample = left.get(0);
        Value rSample = right.get(0);

        ArrayList<Value> result = new ArrayList<>();

        if( lSample.type != Variable.ARRAY || rSample.type != Variable.ARRAY ){

            // If one is array and the other one is not, then its clearly an error
            if( lSample.type == Variable.ARRAY || rSample.type == Variable.ARRAY ){
                Error.throwError(
                        "Cannot multiply matrix by non matrix",
                        ctx
                );
                return null;
            }

            if( lFirstDimension != rFirstDimension ){
                Error.throwError(
                        "Cannot multiply matrices of non consistent sizes",
                        ctx
                );
                return null;
            }

            Value dotProduct = new Value(
                    0,
                    lSample.type
            );

            // Multiply vectors
            for( int i = 0; i < lFirstDimension; i++ ){
                Value l = left.get(i);
                Value r = right.get(i);

                // If any of both aren't atomic types, then its an error
                if( l.type == Variable.ARRAY || r.type == Variable.ARRAY ){
                    Error.throwError(
                            "Cannot multiply matrix by non matrix",
                            ctx
                    );
                    return null;
                }

                Value sum = times( l, r, ctx );
                if( sum == null ){
                    Error.throwError(
                            "No valid multiplication between " +
                                    typeToString(l.type) + " and " +
                                    typeToString(r.type) + "",
                            ctx
                    );
                    return null;
                }
                dotProduct = sum( dotProduct, sum, ctx );
            }

            return dotProduct;
        }

        System.out.println("Multiplying matrices");

        // 2D Matrix multiplication
        // Both operands are matrixes, since they had at least one array inside
        // Now we must make sure they didn't mess things and there are atomic types
        // inside arrays which have arrays as items

        int lSecondDimension = 0;
        int rSecondDimension = 0;

        // Both are arrays, check the size of them
        lSecondDimension = ((ArrayList<Value>) lSample.value).size();
        rSecondDimension = ((ArrayList<Value>) rSample.value).size();

        // Check if we can multiply matrices
        if( lSecondDimension != rFirstDimension ){
            Error.throwError(
                    "Cannot multiply matrices of non consistent sizes",
                    ctx
            );
            return null;
        }

        // Check any inconsistency in left or right dimensions
        if( left.size() < lFirstDimension ){
            Error.throwError(
                    "Inconsistent matrix sizes",
                    ctx
            );
            return null;
        }

        // Check any inconsistency in left or right dimensions
        if( right.size() < lSecondDimension ){
            Error.throwError(
                    "Inconsistent matrix sizes",
                    ctx
            );
            return null;
        }

        System.out.println(lFirstDimension);
        System.out.println(lSecondDimension);
        System.out.println(rSecondDimension);

        // Multiply matrices
        for( int i = 0; i < lFirstDimension; i++ ){
            ArrayList<Value> row = new ArrayList<>();

            for( int j = 0; j < rSecondDimension; j++ ){
                Value sum = new Value<>( 0, newSubtype );

                for( int k = 0; k < lSecondDimension; k++ ){

                    // We could get inconsistent types at any moment
                    Value lPrevValue = left.get(i);
                    if( lPrevValue.type != Variable.ARRAY ){
                        Error.throwError(
                                "Cannot multiply matrix by non matrix",
                                ctx
                        );
                        return null;
                    }

                    ArrayList<Value> lPrev = (ArrayList<Value>) lPrevValue.value;
                    if( lPrev.size() < lSecondDimension ){
                        Error.throwError(
                                "Inconsistent matrix sizes",
                                ctx
                        );
                        return null;
                    }
                    Value l = lPrev.get(k);

                    // Now check consistency of right matrix
                    Value rPrevValue = right.get(k);
                    if( rPrevValue.type != Variable.ARRAY ){
                        Error.throwError(
                                "Cannot multiply matrix by non matrix",
                                ctx
                        );
                        return null;
                    }

                    ArrayList<Value> rPrev = (ArrayList<Value>) rPrevValue.value;
                    if( rPrev.size() < rSecondDimension ){
                        Error.throwError(
                                "Inconsistent matrix sizes",
                                ctx
                        );
                        return null;
                    }

                    Value r = (rPrev).get(j);

                    Value product = times( l, r, ctx );

                    if( product == null ){
                        Error.throwError(
                                "No valid multiplication between " +
                                        typeToString(l.type) + " and " +
                                        typeToString(r.type) + "",
                                ctx
                        );
                        return null;
                    }

                    sum = sum( sum, product, ctx );
                    if( sum == null ){
                        Error.throwError(
                                "No valid sum between " +
                                        typeToString(sum.type) + " and " +
                                        typeToString(product.type) + "",
                                ctx
                        );
                        return null;
                    }
                }

                row.add( sum );
            }

            result.add( new Value<>( row, Variable.ARRAY, newSubtype ) );
        }

        return new Value<>( result, Variable.ARRAY, newSubtype );

    }

}
