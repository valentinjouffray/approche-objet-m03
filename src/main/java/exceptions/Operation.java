package exceptions;

public class Operation {

    public static double diviser(double a, double b) throws MathException {
        if (b==0.0){
            throw new MathException("Vous n'avez pas le droit de diviser par 0");
        }
        if (b==1.0){
            throw new MathException("Vous n'avez pas le droit de diviser par 1");
        }
        return a/b;
    }
}
