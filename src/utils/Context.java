package src.utils;

import src.utils.Variable;
import java.util.*;

public class Context {
    HashMap<String, Variable> definitions;

    public Context( ){
        definitions = new HashMap<>();
    }

    public HashMap<String, Variable> getDefinitions() {
        return this.definitions;
    }

    public void setDefinition( String _name, Variable _value ){
        this.definitions.put( _name, _value );
    }
}