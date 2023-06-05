package src;
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import src.gen.*;
import src.visitors.*;

public class Main {
    public static void main(String[] args) throws IOException{

        //try{
            String rootPath = System.getProperty("user.dir");

            // Common class definition
            SMITHGrammarLexer lexer = new SMITHGrammarLexer(
                    CharStreams.fromReader(
                            new FileReader("src/input/test.txt")
                            // new BufferedReader(
                            //         new InputStreamReader(System.in)
                            // )
                    )
            );

            lexer.removeErrorListeners();
            lexer.addErrorListener( new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
                    throw new RuntimeException("[SMITH] Syntax error: "+msg);
                }

            });

            CommonTokenStream tokens = new CommonTokenStream(
                    lexer
            );
            SMITHGrammarParser parser = new SMITHGrammarParser(
                    tokens
            );

            parser.removeErrorListeners();
            parser.addErrorListener( new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
                    throw new RuntimeException("[SMITH] Syntax error: "+msg);
                }

            });

            // Definition of parsers and visitor
            ParseTree tree = parser.program();
            SMITHVisitor visitor = new SMITHVisitor();

            // Our custom visitor will generate an string
            // containing the final output, which is in fact
            // a translation from Small Basic to Javascript

            visitor.visit(tree);
            // System.out.println(output);
            // FileOutputStream writer = new FileOutputStream(destFile);
            // writer.write(output.getBytes());
        //} catch (Exception e){
        //    System.out.println(e.getMessage());
        //}

    }
}