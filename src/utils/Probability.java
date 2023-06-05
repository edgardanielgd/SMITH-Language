package src.utils;

public class Probability {

    public static double dBinom(int x, int n, double p) {
        return choose(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    public static double pBinom(int x, int n, double p) {
        double sum = 0;
        for (int i = 0; i <= x; i++)
            sum += dBinom(i, n, p);
        return sum;
    }

    public static double qBinom(int x, int n, double p) {
        double sum = 0;
        for (int i = 0; i <= x; i++)
            sum += dBinom(i, n, p);
        return 1 - sum;
    }

    public static int rBinom(int n, double p) {
        int x = 0;
        for (int i = 0; i < n; i++)
            if (Math.random() < p)
                x++;
        return x;
    }

    public static double dGeom(int x, double p) {
        return Math.pow(1 - p, x - 1) * p;
    }

    public static double pGeom(int x, double p) {
        double sum = 0;
        for (int i = 1; i <= x; i++)
            sum += dGeom(i, p);
        return sum;
    }

    public static double qGeom(int x, double p) {
        double sum = 0;
        for (int i = 1; i <= x; i++)
            sum += dGeom(i, p);
        return 1 - sum;
    }

    public static int rGeom(double p) {
        int x = 1;
        while (Math.random() > p)
            x++;
        return x;
    }

    public static double dPois(int x, double lambda) {
        return Math.pow(lambda, x) * Math.exp(-lambda) / factorial(x);
    }

    public static double pPois(int x, double lambda) {
        double sum = 0;
        for (int i = 0; i <= x; i++)
            sum += dPois(i, lambda);
        return sum;
    }

    public static double qPois(int x, double lambda) {
        double sum = 0;
        for (int i = 0; i <= x; i++)
            sum += dPois(i, lambda);
        return 1 - sum;
    }

    public static int rPois(double lambda) {
        int x = 0;
        double p = 1;
        double u = Math.random();
        while (p > u) {
            x++;
            p *= Math.random();
        }
        return x - 1;
    }

    public static double dExp(double x, double lambda) {
        return lambda * Math.exp(-lambda * x);
    }

    public static double pExp(double x, double lambda) {
        return 1 - Math.exp(-lambda * x);
    }

    public static double qExp(double x, double lambda) {
        return -Math.log(1 - x) / lambda;
    }

    public static double rExp(double lambda) {
        return -Math.log(Math.random()) / lambda;
    }

    public static double dUnif(double x, double a, double b) {
        if (x < a || x > b)
            return 0;
        else
            return 1 / (b - a);
    }

    public static double pUnif(double x, double a, double b) {
        if (x < a)
            return 0;
        else if (x > b)
            return 1;
        else
            return (x - a) / (b - a);
    }

    public static double qUnif(double x, double a, double b) {
        return a + x * (b - a);
    }

    public static double rUnif(double a, double b) {
        return a + Math.random() * (b - a);
    }

    public static double dNorm(double x, double mean, double sd) {
        return Math.exp(-Math.pow(x - mean, 2) / (2 * Math.pow(sd, 2))) / (sd * Math.sqrt(2 * Math.PI));
    }

    public static double pNorm(double x, double mean, double sd) {
        return 0.5 * (1 + erf((x - mean) / (sd * Math.sqrt(2))));
    }

    public static double qNorm(double x, double mean, double sd) {
        return 0.5 * (1 - erf((x - mean) / (sd * Math.sqrt(2))));
    }

    public static double rNorm(double mean, double sd) {
        return mean + sd * Math.sqrt(-2 * Math.log(Math.random())) * Math.cos(2 * Math.PI * Math.random());
    }

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    public static double cos(double x) {
        return Math.cos(x);
    }

    public static double sin(double x) {
        return Math.sin(x);
    }

    public static double tan(double x) {
        return Math.tan(x);
    }

    public static double exp(double x) {
        return Math.exp(x);
    }

    private static double erf(double x) {
        double a1 = 0.254829592;
        double a2 = -0.284496736;
        double a3 = 1.421413741;
        double a4 = -1.453152027;
        double a5 = 1.061405429;
        double p = 0.3275911;
        double t = 1 / (1 + p * x);
        double erf = 1 - (((((a5 * t + a4) * t) + a3) * t + a2) * t + a1) * t * Math.exp(-Math.pow(x, 2));
        if (x < 0)
            return -erf;
        else
            return erf;
    }

    private static double choose(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static double factorial(int n) {
        double factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;
        return factorial;
    }


}
