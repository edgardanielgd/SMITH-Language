package src.utils.Expressions;

import src.gen.SMITHGrammarParser;
import src.utils.Variable;

public class ComparisonOperator {
    public static Value evaluate(
            Value leftMost, Value rightMost,
            SMITHGrammarParser.ComparisonoperatorContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean areValidOperands = (
                leftMost.type == Variable.INT ||
                leftMost.type == Variable.FLOAT ||
                leftMost.type == Variable.STRING
        ) && (
                rightMost.type == Variable.INT ||
                rightMost.type == Variable.FLOAT ||
                rightMost.type == Variable.STRING
        );

        if( !areValidOperands )
            return null;

        boolean value;

        if( ctx.LESS() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) < 0;

        else if( ctx.LESS_EQUAL() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) <= 0;

        else if( ctx.GREATER() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) > 0;

        else if( ctx.GREATER_EQUAL() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) >= 0;

        else if( ctx.EQUAL_EQUAL() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) == 0;

        else if( ctx.NOT_EQUAL() != null )
            value = ((Comparable)leftMost.value).compareTo( rightMost.value ) != 0;

        else
            return null;

        return new Value<>( value, Variable.BOOLEAN );
    }
}
