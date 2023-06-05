package src.utils.Expressions;

import org.antlr.v4.runtime.ParserRuleContext;
import src.gen.SMITHGrammarParser;
import src.utils.Error;
import src.utils.Variable;

public class LogicalOperator {

    public static Value or(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean areValidOperands = (
                leftMost.type == Variable.BOOLEAN
        ) && (
                rightMost.type == Variable.BOOLEAN
        );

        if( !areValidOperands ){
            Error.throwError(
                    "Invalid operands for logical operator",
                    ctx
            );
            return null;
        }

        boolean value = (Boolean) leftMost.value || (Boolean) rightMost.value;

        return new Value<>( value, Variable.BOOLEAN );
    }

    public static Value and(
            Value leftMost, Value rightMost,
            ParserRuleContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean areValidOperands = (
                leftMost.type == Variable.BOOLEAN
        ) && (
                rightMost.type == Variable.BOOLEAN
        );

        if( !areValidOperands ){
            Error.throwError(
                    "Invalid operands for logical operator",
                    ctx
            );
            return null;
        }

        boolean value = (Boolean) leftMost.value && (Boolean) rightMost.value;

        return new Value<>( value, Variable.BOOLEAN );
    }
}
