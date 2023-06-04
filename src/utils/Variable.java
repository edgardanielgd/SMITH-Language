package src.utils;

import src.utils.Expressions.Value;

// We will save each variable value and its information here
public class Variable<T> {

    // Variable types available
    public static final int STRING = 1;
    public static final int NUMBER = 2;
    public static final int BOOLEAN = 3;
    public static final int INT = 4;
    public static final int FLOAT = 5;
    public static final int ARRAY = 6;
    public static final int OBJECT = 7;
    public static final int FUNCTION = 8;
    public static final int UNDEFINED = 9;

    public Value value;
    public String name;

    // Default constructor (we don't have default value yet)
    public Variable(String _name, Value _value){
        this.name = _name;
        this.value = _value;
    }

    // Default setters & getters
    public void setValue(Value _value){
        this.value = _value;
    }
    public Value getValue(){
        return this.value;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public String getName(){
        return this.name;
    }
}