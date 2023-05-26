package src.utils;

import src.utils.Context;

// Useful class for representing statements saved in functions code
public class Statement {

    // Statements types available
    public static final int IF = 1;
    public static final int DEFINITION = 2;
    public static final int ASSIGNATION = 3;
    public static final int LOOP = 4;
    public static final int RETURN = 5;

    // Statement's type
    public int type = RETURN;

    public Statement(
        int _type
    ){
        this.type = _type;
    }

    public String execute( Context context ){
        return null;
    }
}