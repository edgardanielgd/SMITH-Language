package src.utils;
// We will save each variable value and its information here
public class Variable <T> {

    // Variable types available
    public static final String STRING = "String";
    public static final String NUMBER = "Number";
    public static final String BOOLEAN = "Boolean";
    public static final String ARRAY = "Array";
    public static final String OBJECT = "Object";
    public static final String FUNCTION = "Function";
    public static final String UNDEFINED = "Undefined";

    private T value;
    private String name;
    private String type;

    // Useful for arrays
    private String subType;

    // Default constructor (we don't have default value yet)
    public Variable(String _name, String _type){
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
    public void setType(String _type){
        this.type = _type;
    }
    public String getType(){
        return this.type;
    }
    public void setSubType(String _subType){
        this.subType = _subType;
    }
    public String getSubType(){
        return this.subType;
    }
}