package src.utils;
// We will save each variable value and its information here
public class Variable<T> {

    // Variable types available
    public static final int STRING = 1;
    public static final int NUMBER = 2;
    public static final int BOOLEAN = 3;
    public static final int ARRAY = 4;
    public static final int OBJECT = 5;
    public static final int FUNCTION = 6;
    public static final int UNDEFINED = 7;

    private T value;
    private String name;
    private int type;

    // Default constructor (we don't have default value yet)
    public Variable(String _name, int _type){
        this.name = _name;
        this.type = type;
    }

    // Default setters & getters
    public void setValue(T _value){
        this.value = _value;
    }
    public T getValue(){
        return this.value;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public String getName(){
        return this.name;
    }
}