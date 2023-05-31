package src.utils.Expressions;

import src.utils.Variable;

public class ComparisonOperator {
    public static Value evaluate( Value leftMost, Value rightMost ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        if( leftMost.type == Variable.INT && rightMost.type == Variable.INT ){
            return new Value<Integer> (
                    (Integer) leftMost.value + (Integer) rightMost.value,
                    Variable.INT
            );
        }
        return null;
    }
}
