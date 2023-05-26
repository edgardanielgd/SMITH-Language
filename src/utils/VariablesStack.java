package src.utils;

import java.util.Stack;
import src.utils.Variable;

public class VariablesStack {

    // Variables are grouped by block definition, so we can just delete
    // theirs block
    private class StackGroup {
        private Stack<Variable> stack;

        public StackGroup(){
            this.stack = new Stack<Variable>();
        }

        public void push(Variable _var){
            this.stack.push(_var);
        }

        public Variable pop(){
            return this.stack.pop();
        }


        public Stack<Variable> getStack(){
            return this.stack;
        }

        // Useful methods for our context

        // Get variable in current block, if exists
        public Variable getVariable( String name ){
            for( Variable var : this.stack ){
                if( var.getName().equals(name) )
                    return var;
            }
            return null;
        }
    }

    // Useful for saving variables stack
    private Stack<StackGroup> stack;

    public VariablesStack(){
        this.stack = new Stack<StackGroup>();
    }

    // Push a new block
    public void pushBlock(){
        // Create a new definitions block
        this.stack.push( new StackGroup() );
    }

    // Pop last block
    public void popBlock(){
        // I.e., when a block is finished
        this.stack.pop();
    }

    // Search inside all blocks
    public Variable getVariable( String name ){
        // We will search in all blocks for a variable definition

        for( StackGroup group : this.stack ){
            Variable var = group.getVariable(name);
            if( var != null )
                return var;
        }
        return null;
    }
}