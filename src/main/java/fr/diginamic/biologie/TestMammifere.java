package fr.diginamic.biologie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.function.Consumer;

public class TestMammifere {
    public static void main(String[] args) {
        ArrayList<Carnivore> carnivores = new ArrayList<>();
        carnivores.add(new Lion()); // 0
        carnivores.add(new Dauphin()); // 1
        carnivores.add(new Orque()); // 2
        carnivores.add(new Dauphin());
        carnivores.add(new Lion());
        carnivores.add(new Lion());
        carnivores.add(new Dauphin());

        carnivores.forEach(carnivore -> System.out.println(carnivore)); // expression lambda

        // Pour dupliquer une ArrayList :
        ArrayList<Carnivore> carnivoresCopie = new ArrayList<>(carnivores);

        // Pour parcourir une liste tout en supprimant des éléments il est vivement
        // recommandé d'utiliser un Iterator.
        Iterator<Carnivore> iter = carnivores.iterator();
        while (iter.hasNext()) {
            Carnivore c = iter.next();
            if (c instanceof Dauphin) {
                iter.remove();
            }
        }

        // Après utilisation d'un iterator il faut le recréer.
        // On peut réutiliser la même variable :
        iter = carnivores.iterator();


        System.out.println(carnivores.size());
    }

    public static Carnivore getCarnivore(String type) {
        if (type.equals("L")) {
            return new Lion();
        }
        else if (type.equals("D")) {
            return new Dauphin();
        }
        return null;
    }

    public static void traiterCarnivore(Carnivore carnivore) {


    }
}
