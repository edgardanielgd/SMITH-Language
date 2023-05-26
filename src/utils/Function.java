package src.utils;
import src.utils.Statement;
import src.utils.Statements.*;
import src.utils.Variable;
import src.utils.Context;

import java.util.*;


public class Function<T> extends Variable {
    ArrayList<Statement> code;

    T returnValue;

    int returnType;

    Context context;

    private Function( String _name ){
        super(_name, Variable.FUNCTION);
        this.returnType = Variable.UNDEFINED;
    };
    public Function(
        String _name, int _returnType
    ){
        super(_name, Variable.FUNCTION);
        this.returnType = _returnType;
    }

    public void addStatement(
        ReturnStatement _statement
    ){
        this.code.add( _statement );
    }

    public ArrayList<Statement> getCode() {
        return code;
    }

    // Execute code inside this function
    public String execute() {
        for( Statement statement : this.code ){
            String result = statement.execute( null );

            // Lets say this is an erro
            if( result != null ) return result;

            // Check if this is a return statement
            if( statement.type == Statement.RETURN ){
                // Return calculated valaue
                T returnValue = ((ReturnStatement<T>) statement).getReturnValue();
                break;
            }
        }
        return null;
    }
}