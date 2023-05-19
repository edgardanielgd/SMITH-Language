package src;
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import src.gen.*;
import src.visitors.*;

public class Main {
    public static void main(String[] args) throws IOException{

        String rootPath = System.getProperty("user.dir");

        String destFile = rootPath+"./src/output/output.js";

        if( args.length > 1 )
            destFile = args[1];

        // Common class definition
        SMITHGrammarLexer lexer = new SMITHGrammarLexer(
                CharStreams.fromReader(
                        new FileReader("./src/input/test.txt")
                        // new BufferedReader(
                        //         new InputStreamReader(System.in)
                        // )
                )
        );
        CommonTokenStream tokens = new CommonTokenStream(
                lexer
        );
        SMITHGrammarParser parser = new SMITHGrammarParser(
                tokens
        );

        // Definition of parsers and visitor
        ParseTree tree = parser.s();
        SMITHVisitor visitor = new SMITHVisitor();

        // Our custom visitor will generate an string
        // containing the final output, which is in fact
        // a translation from Small Basic to Javascript

        String output = (String)visitor.visit(tree);
        System.out.println(output);
        FileOutputStream writer = new FileOutputStream(destFile);
        writer.write(output.getBytes());
    }
}