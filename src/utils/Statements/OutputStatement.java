package src.utils.Statements;
import org.knowm.xchart.SwingWrapper;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Error;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Expressions.ParseType;
import src.utils.Variable;
import org.knowm.xchart.XYChart;
import java.io.*;
import java.util.ArrayList;

public class OutputStatement {

    public static String generatePrintable( Value toPrint ){
        String printable = "";

        if( toPrint.type == Variable.STRING ){
            printable = (String) toPrint.value;
        } else if ( toPrint.type == Variable.INT ) {
            printable = Integer.toString((Integer) toPrint.value);
        } else if ( toPrint.type == Variable.FLOAT ) {
            printable = Double.toString((Double) toPrint.value);
        } else if ( toPrint.type == Variable.BOOLEAN ) {
            printable = Boolean.toString((Boolean) toPrint.value);
        } else if( toPrint.type == Variable.ARRAY ){
            printable += "[";
            ArrayList<Value> array = (ArrayList<Value>) toPrint.value;
            for( int i = 0; i < array.size(); i++ ){
                printable += generatePrintable(array.get(i));
                if( i != array.size() - 1 )
                    printable += ", ";
            }
            printable += "]";
        }

        return printable;
    }
    public static int handle(
            ContextManager context,
            SMITHGrammarParser.OutputblockContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){

        // Handle output definition
        SMITHGrammarParser.OutputextensionContext extension = ctx.outputextension();

        // Check if this is a print-case output
        if( extension.printtype() != null ){
            SMITHGrammarParser.PrinttypeContext type = extension.printtype();
            // Get expression
            SMITHGrammarParser.ExpressionContext expression = extension.expression(0);
            // Evaluate expression
            Value value = Expression.evaluate(expression, context, parentVisitor);

            String printable = generatePrintable(value);

            if( type.PRINT() != null ){
                // Print value
                System.out.print(printable);
            } else if( type.PRINTLN() != null ) {
                // Print value
                System.out.println(printable);
            } else {
                // If it is an error
                Error.throwError(
                        "Invalid print type",
                        ctx
                );
                return 1;
            }

            return 0;
        }

        if( extension.PLOT() != null ){
            // Generate a 2D plot of points
            Value x = Expression.evaluate(extension.expression(0), context, parentVisitor);
            Value y = Expression.evaluate(extension.expression(1), context, parentVisitor);

            if( x == null || y == null ){
                Error.throwError(
                        "Plot requires two arrays",
                        ctx
                );
                return 1;
            }

            if( x.type != Variable.ARRAY || y.type != Variable.ARRAY ){
                Error.throwError(
                        "Plot requires two arrays",
                        ctx
                );
                return 1;
            }

            if(
                (x.subtype != Variable.FLOAT && x.subtype != Variable.INT) ||
                (x.subtype != Variable.FLOAT && y.subtype != Variable.INT)
            ){
                Error.throwError(
                        "Plot requires two arrays of numbers",
                        ctx
                );
                return 1;
            }

            ArrayList<Value> xValues = (ArrayList<Value>) x.value;
            ArrayList<Value> yValues = (ArrayList<Value>) y.value;

            // Check if arrays have the same size
            if( xValues.size() != yValues.size() ){
                Error.throwError(
                        "Plot requires two arrays of the same size",
                        ctx
                );
                return 1;
            }

            // Parse lists to arrays
            double[] xArray = new double[xValues.size()];
            double[] yArray = new double[yValues.size()];

            for(int i = 0; i < xValues.size(); i++){
                Value xVal = xValues.get(i);
                if( xVal.type != Variable.INT && xVal.type != Variable.FLOAT ){
                    Error.throwError(
                            "Plot requires two arrays of numbers",
                            ctx
                    );
                    return 1;
                }
                xVal = ParseType.parseToNeededType(
                        xVal,
                        Variable.FLOAT
                );

                if( xVal == null ){
                    Error.throwError(
                            "Plot requires two arrays of numbers",
                            ctx
                    );
                    return 1;
                }

                Value yVal = yValues.get(i);
                if( yVal.type != Variable.INT && yVal.type != Variable.FLOAT ){
                    Error.throwError(
                            "Plot requires two arrays of numbers",
                            ctx
                    );
                    return 1;
                }
                yVal = ParseType.parseToNeededType(
                        yVal,
                        Variable.FLOAT
                );

                if( yVal == null ){
                    Error.throwError(
                            "Plot requires two arrays of numbers",
                            ctx
                    );
                    return 1;
                }

                xArray[i] = (double)xVal.value;
                yArray[i] = (double)yVal.value;
            }

            // Create chart
            XYChart chart = new XYChart(500, 400);
            chart.setTitle("Plot");
            chart.setXAxisTitle("x");
            chart.setYAxisTitle("y");

            // Add series
            chart.addSeries("Result", xArray, yArray);

            // Show it
            new SwingWrapper(chart).displayChart();

            return 0;
        }

        if( extension.WRITEFILE() != null ){
            Value output = Expression.evaluate(extension.expression(0), context, parentVisitor);
            Value filename = Expression.evaluate(extension.expression(1), context, parentVisitor);

            if( output == null || filename == null ){
                Error.throwError(
                        "Writefile requires two valid arguments",
                        ctx
                );
                return 1;
            }

            String printable = generatePrintable(output);

            if( filename.type != Variable.STRING ){
                Error.throwError(
                        "Error: Writefile requires a string as filename",
                        ctx
                );
                return 1;
            }

            // Write to file
            try {
                FileWriter myWriter = new FileWriter((String) filename.value);
                myWriter.write(printable);
                myWriter.close();

                return 0;
            } catch (java.io.IOException e) {
                Error.throwError(
                        "Error: Could not write to file",
                        ctx
                );
                return 1;
            }
        }

        // If it is an error
        Error.throwError(
                "Invalid output type",
                ctx
        );
        return 1;
    }
}
