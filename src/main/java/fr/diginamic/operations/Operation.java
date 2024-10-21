package fr.diginamic.operations;

public class Operation {
    public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division par zéro impossible");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Opérateur inconnu");
        }
    }
}
