package src.utils;

import java.util.HashMap;
import java.util.Stack;

// Create an Stack of "Contexts", each Context is composed by
// a hashmap identifying variables
public class ContextManager {
    private Stack<HashMap<String, Variable>> stack;

    // Useful for checking some environment issues
    boolean insideFunction = false;

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
        for( HashMap<String, Variable> context : this.stack ){
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

    // TODO: Add a method for slicing current block (for functions, in case we still want to do that crazy thing)
}