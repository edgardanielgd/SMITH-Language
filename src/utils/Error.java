package src.utils;

import org.antlr.v4.runtime.ParserRuleContext;

public class Error {
    public static void throwError (
            String msg,
            ParserRuleContext ctx
    ) {
        // Get line and row
        int line = ctx.getStart().getLine();
        int row = ctx.getStart().getCharPositionInLine();

        // Throw error
        System.err.println("[SMITH] Error: " + msg + " at line " + line + ", row " + row);
        System.exit(1);
    }
}
