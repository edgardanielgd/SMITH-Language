package src.utils.Statements;

import src.utils.Statement;
import src.utils.Variable;
import src.utils.Context;
import java.util.*;

public class ReturnStatement<T> extends Statement {
    T returnValue;

    public ReturnStatement(){
        super( Statement.RETURN );
    }

    // Returns an error as String, null if execution ended up successfully
    public String execute( Context context) {
        return null;
    }

    public T getReturnValue() {
        return this.returnValue;
    }
}