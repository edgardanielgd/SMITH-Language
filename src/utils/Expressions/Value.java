package src.utils.Expressions;

import src.utils.Variable;

// Class for identifying a value and its type faster
public class Value<T> {

    public T value;
    public int type;
    public int subtype;

    public Value(T _value, int _type) {
        this.value = _value;
        this.type = _type;
    }

    public Value(T _value, int _type, int _subtype ){
        this.value = _value;
        this.type = _type;
        this.subtype = _subtype;
    }
}
