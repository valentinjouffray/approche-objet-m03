package fr.diginamic.demogeneriques;

import fr.diginamic.biologie.Crocodile;
import fr.diginamic.biologie.Lion;

public class TestConteneur {
    public static void main(String[] args) {
        Conteneur<Crocodile, String> c1 = new Conteneur<>(new Crocodile(), "Coucou");
        Conteneur<Lion, Integer> c2 = new Conteneur<>(new Lion(), 125);

        String[] tab = new String[10];
    }
}
