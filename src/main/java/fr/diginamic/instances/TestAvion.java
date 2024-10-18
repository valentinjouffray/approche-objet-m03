package fr.diginamic.instances;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

import java.util.Date;

public class TestAvion {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("John", "Doe", new Date());
        Passager passager1 = new Passager("Alice", "Doe", 1);
        Passager passager2 = new Passager("Bob", "Doe", 2);
        Passager passager3 = new Passager("Charlie", "Doe", 3);
        Passager[] passagers = {passager1, passager2, passager3};
        Avion avion1 = new Avion("F-GHJK", "Airbus", "A320");
        Avion avion2 = new Avion("F-GHJL", "Boeing", "737", pilote1);
        System.out.println("Avion 2 sans passager:");
        System.out.println(avion2);
        avion2.addPassager(passager1);
        avion2.addPassager(passager2);
        System.out.println("Avion 2 avec 2 passagers:");
        System.out.println(avion2);
    }
}
