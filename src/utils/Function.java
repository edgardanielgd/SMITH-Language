package src.utils;

import src.gen.SMITHGrammarVisitor;
import src.utils.Statements.*;
import src.utils.ContextManager;
import java.util.*;
import src.gen.SMITHGrammarParser;
public class Function<T> extends Variable {

    int returnType; // Its a Variable type

    // Functions must have a custom context that has been sliced from original context
    // and contains all variables defined before creating this function
    ContextManager ownedContext;

    // We would save function parse tree here
    // and revisit for each function call
    SMITHGrammarParser.FunctionblockContext ctx;

    private Function(
            String _name,
            ContextManager _context,
            SMITHGrammarParser.FunctionblockContext _ctx
            ){
        super(_name, Variable.FUNCTION);
        this.ownedContext = _context;
        this.ctx = _ctx;
        this.returnType = Variable.UNDEFINED;
    };
    public Function(
        String _name,
        int _returnType,
        ContextManager _context,
        SMITHGrammarParser.FunctionblockContext _ctx
    ){
        super(_name, Variable.FUNCTION);
        this.ownedContext = _context;
        this.ctx = _ctx;
        this.returnType = _returnType;
    }

    // Method for revisiting this function
    public T call(
            SMITHGrammarVisitor parentVisitor,
            ContextManager context
    ){
        // Handle function call
        return null;
    }
}