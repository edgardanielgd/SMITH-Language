package src.utils.Statements;

import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Error;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Variable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputStatement {
    public static Value handle(
            ContextManager context,
            SMITHGrammarParser.InputblockContext ctx,
            SMITHGrammarVisitor parentVisitor
    ) {
        // Handle input definition
        SMITHGrammarParser.InputextensionContext extension = ctx.inputextension();

        if( extension.READFILE() != null ){
            Value fileName = Expression.evaluate(extension.expression(), context, parentVisitor);

            if( fileName.type != Variable.STRING ){
                Error.throwError("File name must be a string", ctx);
            }

            String file = (String) fileName.value;

            // Save result into a value of type String always
            String result = "";

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                while (line != null) {
                    line = reader.readLine();
                    result += line;
                }
                reader.close();
            } catch (IOException e) {
                Error.throwError("File not found", ctx);
                return null;
            }

            Value resultValue = new Value(result, Variable.STRING);
            return resultValue;
        }

        if( extension.READCONSOLE() != null ){
            // Read from classic java console
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
            String input = "";
            try {
                input = reader.readLine();
            } catch (IOException e) {
                Error.throwError("Error reading from console", ctx);
                return null;
            }

            Value resultValue = new Value(input, Variable.STRING);
            return resultValue;
        }

        Error.throwError(
                "Invalid input statement",
                ctx
        );
        return null;
    }
}