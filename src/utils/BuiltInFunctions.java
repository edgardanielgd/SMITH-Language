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
                    new Class<?>[]{int.class, int.class, float.class}, // dBinom
                    new Class<?>[]{int.class, int.class, float.class}, // pBinom
                    new Class<?>[]{int.class, int.class, float.class}, // qBinom
                    new Class<?>[]{int.class, float.class}, // rBinom
                    new Class<?>[]{int.class, float.class}, // dGeom
                    new Class<?>[]{int.class, float.class}, // pGeom
                    new Class<?>[]{int.class, float.class}, // qGeom
                    new Class<?>[]{float.class}, // rGeom
                    new Class<?>[]{int.class, float.class}, // dPois
                    new Class<?>[]{int.class, float.class}, // pPois
                    new Class<?>[]{int.class, float.class}, // qPois
                    new Class<?>[]{float.class}, // rPois
                    new Class<?>[]{float.class, float.class, float.class}, // dNorm
                    new Class<?>[]{float.class, float.class, float.class}, // pNorm
                    new Class<?>[]{float.class, float.class, float.class}, // qNorm
                    new Class<?>[]{float.class, float.class}, // rNorm
                    new Class<?>[]{float.class, float.class}, // dExp
                    new Class<?>[]{float.class, float.class}, // pExp
                    new Class<?>[]{float.class, float.class}, // qExp
                    new Class<?>[]{float.class}, // rExp
                    new Class<?>[]{float.class, float.class, float.class}, // dUnif
                    new Class<?>[]{float.class, float.class, float.class}, // pUnif
                    new Class<?>[]{float.class, float.class, float.class}, // qUnif
                    new Class<?>[]{float.class, float.class} // rUnif
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

    public static int callBuiltInFunction(String name,
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

        float result = 0;

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
                } else if (parameterTypes[i].equals(float.class)) {
                    if (arguments.get(i).type == Variable.FLOAT) return -2;
                }
            }

            if (parameterTypes.length != arguments.size()) return -2;

            // Obtener la clase que contiene la función
            Class<?> pClass = Probability.class;

            // Obtener la referencia al método
            Method method = pClass.getMethod(functionName, parameterTypes);

            // Invocar al método
            Object r = method.invoke(null, arguments.toArray());

            // Try to cast the result to float
            result = (float) r;
        } catch (Exception e) {
            e.printStackTrace();
        }

        context.setReturnValue(
                        new Value<>(
                                result,
                                Variable.FLOAT
                        )
        );

        return 0;
    }
}
