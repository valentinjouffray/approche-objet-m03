package fr.diginamic.essais;

import fr.diginamic.operations.Operation;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("Addition: " + Operation.calcul(5, 3, '+'));
        System.out.println("Soustraction: " + Operation.calcul(5, 3, '-'));
        System.out.println("Multiplication: " + Operation.calcul(5, 3, '*'));
        System.out.println("Division: " + Operation.calcul(5, 3, '/'));
    }
}
