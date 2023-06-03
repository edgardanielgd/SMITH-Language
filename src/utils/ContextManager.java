package src.utils;

import src.utils.Expressions.Value;

import javax.naming.Context;
import java.util.HashMap;
import java.util.Stack;

// Create an Stack of "Contexts", each Context is composed by
// a hashmap identifying variables
public class ContextManager {
    public Stack<HashMap<String, Variable>> stack;

    // Useful for checking some environment issues
    boolean insideFunction = false;

    // Return type expected for this function
    int functionReturn = 0;

    // Returned value for last function
    Object returnValue = null;

    public ContextManager(){
        this.stack = new Stack<HashMap<String,Variable>>();
        insideFunction = false; // We are supossed to start from main body
    }

    public void defineVariable(String _varName, Variable _var){
        // Add a new variable to the current context block
        // Recall current context block is a hashmap which is located at
        // Stack's top
        this.stack.peek().put(_varName, _var);
    }

    public Variable searchVariable(String _varName){
        // Searches for a variable defined in all contexts
        // cumulated in the stack, start from top to bottom

        Stack<HashMap<String,Variable>> auxStack = (Stack<HashMap<String,Variable>>) this.stack.clone();

        while( auxStack.size() > 0 ){
            HashMap<String, Variable> context = auxStack.pop();
            if( context.containsKey(_varName) )
                return context.get(_varName);
        }

        // Couldn't find variable
        return null;
    }

    public HashMap<String,Variable> push(){
        // Adds a new Context, this is called when a new block of code
        // is reached
        return this.stack.push( new HashMap<>() );
    }

    public HashMap<String,Variable> pop(){
        // Removes the current context, this is called when a block of code
        // is finished
        return this.stack.pop();
    }

    public void setReturnValue(Object _value){
        this.returnValue = _value;
    }

    public Object getReturnValue(){
        return this.returnValue;
    }

    // We can slice the stack and get all definitions for this context, we must copy and join
    // all hashmaps, each time a function is called we will create a copy of THIS context
    // so things like recursion won't fail
    public HashMap<String, Variable> resumeContext() {
        HashMap<String, Variable> context = new HashMap<>();
        for( HashMap<String, Variable> block : this.stack ){
            for( String key : block.keySet() ){
                // We are iterating from bottom to top, so we must check if
                context.put(key, block.get(key));
            }
        }
        return context;
    }
}