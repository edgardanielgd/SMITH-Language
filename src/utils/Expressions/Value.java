package src.utils.Expressions;

import src.utils.Variable;

// Class for identifying a value and its type faster
public class Value<T> {

    public T value;
    public int type;
    public int subtype;
    public int[] dimensions;

    public Value(T value, int type) {
        this.value = value;
        this.type = type;
    }

    public T getValue() {
        return this.value;
    }
}
