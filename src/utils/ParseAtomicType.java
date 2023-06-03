package src.utils;

import src.gen.SMITHGrammarParser;

public class ParseAtomicType {
    public static int getVariableType(SMITHGrammarParser.AtomictypeContext atomicType){
        if( atomicType.INT() != null ){
            return Variable.INT;
        } else if( atomicType.FLOAT() != null ){
            return Variable.FLOAT;
        } else if( atomicType.STRING() != null ){
            return Variable.STRING;
        } else if( atomicType.BOOL() != null ){
            return Variable.BOOLEAN;
        } else {
            // This should never happen
            return Variable.UNDEFINED;
        }
    }
}
