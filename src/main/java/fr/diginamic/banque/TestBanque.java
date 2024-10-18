package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("123456", 1000);
        CompteTaux compte2 = new CompteTaux("123456", 1000, 0.2f);
        Compte[] comptes = {compte1, compte2};

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
