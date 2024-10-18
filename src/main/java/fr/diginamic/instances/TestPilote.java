package fr.diginamic.instances;

import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

import java.util.Date;

public class TestPilote {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("John", "Doe", new Date());
        Pilote pilote2 = new Pilote("Jane", "Doe", new Date());
    }
}
