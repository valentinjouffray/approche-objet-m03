package fr.diginamic.instances.entites;

import java.util.Arrays;

public class Avion {
    String immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    Passager[] passagers;

    public Avion(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.passagers = new Passager[0];
    }

    public Avion(String immatriculation, String marque, String modele, Pilote pilote) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passagers = new Passager[0];
    }

    public Avion(String immatriculation, String marque, String modele, Pilote pilote, int nbPassagers) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passagers = new Passager[nbPassagers];
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    public void addPassager(Passager passager) {
        Passager[] newPassagers = new Passager[passagers.length + 1];
        System.arraycopy(passagers, 0, newPassagers, 0, passagers.length);
        newPassagers[passagers.length] = passager;
        passagers = newPassagers;
    }

    public void removePassager(Passager passager) {
        Passager[] newPassagers = new Passager[passagers.length - 1];
        int j = 0;
        for (int i = 0; i < passagers.length; i++) {
            if (passagers[i] != passager) {
                newPassagers[j] = passagers[i];
                j++;
            }
        }
        passagers = newPassagers;
    }

    @Override
    public String toString() {
        String sb = "Avion{" + "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", pilote=" + pilote +
                ", passagers=" + (passagers == null ? "null" : Arrays.asList(passagers).toString()) +
                '}';
        return sb;
    }
}
