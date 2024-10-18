package fr.diginamic.instances;

import java.util.Date;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Pilote;
import fr.diginamic.utils.AvionFactory;

public class TestAvionFactory {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("John", "Doe", new Date());
        Avion avion1 = AvionFactory.getInstance("F-GHJK", "Airbus", "A320", pilote1, 3);
        Avion avion2 = AvionFactory.getInstance("F-GHJL", "Boeing", "737", pilote1, 1);
        Avion avion3 = AvionFactory.transfert(avion1, avion2);
        System.out.println("Avion 1:");
        System.out.println(avion1);
        System.out.printf("Avion 1 a %d passagers\n", avion1.getPassagers().length);
        System.out.println("Avion 2:");
        System.out.println(avion2);
        System.out.printf("Avion 2 a %d passagers\n", avion2.getPassagers().length);
        System.out.println("Avion 3:");
        System.out.println(avion3);
        System.out.printf("Avion 3 a %d passagers\n", avion3.getPassagers().length);
    }
}
