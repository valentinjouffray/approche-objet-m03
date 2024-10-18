package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Pilote;

public class AvionFactory {
    public static Avion getInstance(String immatriculation, String marque, String modele, Pilote pilote, int nbPassagers) {
        return new Avion(immatriculation, marque, modele, pilote, nbPassagers);
    }

    public static Avion transfert(Avion avion1, Avion avion2) {
        Avion avionDepart = avion1.getPassagers().length > avion2.getPassagers().length ? avion2 : avion1;
        Avion avionArrivee = avion1.getPassagers().length > avion2.getPassagers().length ? avion1 : avion2;

        Avion avionFinal = new Avion(avionArrivee.getImmatriculation(), avionArrivee.getMarque(), avionArrivee.getModele(), avionArrivee.getPilote(), avionArrivee.getPassagers().length + avionDepart.getPassagers().length);

        avionFinal.setPassagers(avionArrivee.getPassagers());
        for (int i = 0; i < avionDepart.getPassagers().length; i++) {
            avionFinal.addPassager(avionDepart.getPassagers()[i]);
        }

        return avionFinal;
    }
}
