package src.utils;

import src.gen.SMITHGrammarParser;
import src.utils.Expressions.Value;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class BuiltInFunctions {
    private static final String[] BUILTINFUNCTIONS = {
            "dBinom",
            "pBinom",
            "qBinom",
            "rBinom",
            "dGeom",
            "pGeom",
            "qGeom",
            "rGeom",
            "dPois",
            "pPois",
            "qPois",
            "rPois",
            "dNorm",
            "pNorm",
            "qNorm",
            "rNorm",
            "dExp",
            "pExp",
            "qExp",
            "rExp",
            "dUnif",
            "pUnif",
            "qUnif",
            "rUnif",
    };

    private static final ArrayList<Class<?>[]> PARAMETERTYPES = new ArrayList<>(
            Arrays.asList(
                    new Class<?>[]{int.class, int.class, double.class}, // dBinom
                    new Class<?>[]{int.class, int.class, double.class}, // pBinom
                    new Class<?>[]{int.class, int.class, double.class}, // qBinom
                    new Class<?>[]{int.class, double.class}, // rBinom
                    new Class<?>[]{int.class, double.class}, // dGeom
                    new Class<?>[]{int.class, double.class}, // pGeom
                    new Class<?>[]{int.class, double.class}, // qGeom
                    new Class<?>[]{double.class}, // rGeom
                    new Class<?>[]{int.class, double.class}, // dPois
                    new Class<?>[]{int.class, double.class}, // pPois
                    new Class<?>[]{int.class, double.class}, // qPois
                    new Class<?>[]{double.class}, // rPois
                    new Class<?>[]{double.class, double.class, double.class}, // dNorm
                    new Class<?>[]{double.class, double.class, double.class}, // pNorm
                    new Class<?>[]{double.class, double.class, double.class}, // qNorm
                    new Class<?>[]{double.class, double.class}, // rNorm
                    new Class<?>[]{double.class, double.class}, // dExp
                    new Class<?>[]{double.class, double.class}, // pExp
                    new Class<?>[]{double.class, double.class}, // qExp
                    new Class<?>[]{double.class}, // rExp
                    new Class<?>[]{double.class, double.class, double.class}, // dUnif
                    new Class<?>[]{double.class, double.class, double.class}, // pUnif
                    new Class<?>[]{double.class, double.class, double.class}, // qUnif
                    new Class<?>[]{double.class, double.class} // rUnif
                    )
    );


    public static boolean isBuiltInFunction(String name) {
        name = name.toLowerCase();
        for (String builtin : BUILTINFUNCTIONS) {
            if (name.equals(builtin.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static double callBuiltInFunction(String name,
                                           ContextManager context,
                                           SMITHGrammarParser.FunctioncallargumentsContext args) {
        name = name.toLowerCase();

        // Extract arguments
        ArrayList<Value> arguments = new ArrayList<>();
        SMITHGrammarParser.CallargumentsContext argument = args.callarguments();
        SMITHGrammarParser.FurthercallargumentsContext furtherarguments;

        while (argument != null && argument.getChildCount() > 0) {
            // While there are arguments, add them to list

            Value evaluatedValue = Expression.evaluate(
                    argument.expression(),
                    context,
                    null
            );

            arguments.add(
                    evaluatedValue
            );

            // Advance in arguments list
            furtherarguments = argument.furthercallarguments();
            argument = furtherarguments.callarguments();
        }

        double result = 0;

        // Get the index of the function
        int index = -1;
        for (int i = 0; i < BUILTINFUNCTIONS.length; i++) {
            if (name.equals(BUILTINFUNCTIONS[i].toLowerCase())) {
                index = i;
                break;
            }
        }

        try {
            // Obtener el nombre de la función y los parámetros
            String functionName = BUILTINFUNCTIONS[index];
            Class[] parameterTypes = PARAMETERTYPES.get(index);

            for (int i = 0; i < arguments.size(); i++) {
                if (parameterTypes[i].equals(int.class)) {
                    if (arguments.get(i).type != Variable.INT) return -2;
                } else if (parameterTypes[i].equals(double.class)) {
                    if (arguments.get(i).type != Variable.FLOAT) return -2;
                }
            }

            if (parameterTypes.length != arguments.size()) return -2;

            // Obtener la clase que contiene la función
            Class<?> pClass = Probability.class;

            // Obtener la referencia al método
            Method method = pClass.getMethod(functionName, parameterTypes);

            ArrayList<Object> argumentsNumber = new ArrayList<>();

            for (Value v : arguments) {
                argumentsNumber.add(v.value);
            }

            // Invocar al método
            Object r = method.invoke(null, argumentsNumber.toArray());

            // Try to cast the result to float
            result = (double) r;

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Built-in function error");
            e.printStackTrace();
        }

        return result;
    }
}
