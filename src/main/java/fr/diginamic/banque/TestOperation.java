package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tabOpes = new Operation[4];
        tabOpes[0] = new Credit("19/05/2023", 150.0);
        tabOpes[1] = new Debit("20/05/2023", 25.8);
        tabOpes[2] = new Credit("21/05/2023", 225.0);
        tabOpes[3] = new Debit("22/05/2023", 70.0);

        double solde = 0.0;
        for (int i = 0; i < tabOpes.length; i++) {

            if (tabOpes[i] instanceof Credit) {
                Credit credit = (Credit)tabOpes[i];
                System.out.println(credit.getInfos());
            }
            System.out.println(tabOpes[i]);
            // 1. Java évalue l'expr à droite du =
            // 2. J'affecte le résultat à solde
            solde = tabOpes[i].recalculerSolde(solde);
        }
        System.out.println("Solde global="+solde);
        System.out.println("---------------------------------");
        for (Operation ope : tabOpes) { // la boucle objet permet de parcourir un itérable
            System.out.println(ope);
        }
    }
}
