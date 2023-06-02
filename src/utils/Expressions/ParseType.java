package src.utils.Expressions;

import src.utils.Variable;

public class ParseType {
    public static Value parseToNeededType(
            Value toParse,
            int destinationType
    ){
        if( toParse.type == destinationType )
            return toParse;

        if( toParse.type == Variable.INT ){
            switch( destinationType ){
                case Variable.FLOAT:
                    return new Value<> (
                            Double.valueOf( (Integer) toParse.value),
                            Variable.FLOAT
                    );
                case Variable.STRING:
                    return new Value<> (
                            Integer.toString((Integer) toParse.value),
                            Variable.STRING
                    );
                case Variable.BOOLEAN:
                    return new Value<> (
                            (Integer) toParse.value != 0,
                            Variable.BOOLEAN
                    );
            }
        } else if( toParse.type == Variable.FLOAT ){
            switch( destinationType ){
                case Variable.INT:
                    return new Value<> (
                            ((Double) toParse.value).intValue(),
                            Variable.INT
                    );
                case Variable.STRING:
                    return new Value<> (
                            Double.toString((Double) toParse.value),
                            Variable.STRING
                    );
                case Variable.BOOLEAN:
                    return new Value<> (
                            (Double) toParse.value != 0,
                            Variable.BOOLEAN
                    );
            }
        } else if( toParse.type == Variable.STRING ){
            switch( destinationType ){
                case Variable.INT:
                    return new Value<> (
                            Integer.parseInt((String) toParse.value),
                            Variable.INT
                    );
                case Variable.FLOAT:
                    return new Value<> (
                            Double.parseDouble((String) toParse.value),
                            Variable.FLOAT
                    );
                case Variable.BOOLEAN:
                    return new Value<> (
                            Boolean.parseBoolean((String) toParse.value),
                            Variable.BOOLEAN
                    );
            }
        } else if( toParse.type == Variable.BOOLEAN ){
            switch( destinationType ){
                case Variable.INT:
                    return new Value<> (
                            (Boolean) toParse.value ? 1 : 0,
                            Variable.INT
                    );
                case Variable.FLOAT:
                    return new Value<> (
                            (Boolean) toParse.value ? 1.0 : 0.0,
                            Variable.FLOAT
                    );
                case Variable.STRING:
                    return new Value<> (
                            (Boolean) toParse.value ? "true" : "false",
                            Variable.STRING
                    );
            }
        }
        return null;
    }

    public static boolean isNumberParseable(
            Value toParse
    ){
        if( toParse.type == Variable.INT ){
            return true;
        } else if( toParse.type == Variable.FLOAT ){
            return true;
        } else if( toParse.type == Variable.STRING ){
            try {
                Double.parseDouble((String) toParse.value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else if( toParse.type == Variable.BOOLEAN ){
            return true;
        }
        return false; }
}
