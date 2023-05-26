package exceptions;

import java.util.Scanner;

public class TestOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vuillez entrer une première valeur :");
            double valeurA = Double.parseDouble(scanner.nextLine());

            System.out.println("Vuillez entrer une seconde valeur :");
            double valeurB = Double.parseDouble(scanner.nextLine());

            try {
                double resultat = Operation.diviser(valeurA, valeurB);
                System.out.println("Le résutat est " + resultat);

            } catch (MathException e) {
                System.err.println("ERROR:" + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR:" + e.getMessage());
            }

            try {
                double resultat = Operation.diviser(valeurA, valeurB);
                System.out.println("Le résutat est " + resultat);

                System.out.println("Coucou");
                // Je mets ce que je veux ici

            } catch (MathException e) {
                System.err.println("ERROR:" + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR:" + e.getMessage());
            }

            // Tu peux mettre du code ici

        }
    }
}
