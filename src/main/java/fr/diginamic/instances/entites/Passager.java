package fr.diginamic.instances.entites;

public class Passager {
    String prenom;
    String nom;
    int numeroSiege;

    public Passager(String prenom, String nom, int numeroSiege) {
        this.prenom = prenom;
        this.nom = nom;
        this.numeroSiege = numeroSiege;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroSiege() {
        return numeroSiege;
    }

    public void setNumeroSiege(int numeroSiege) {
        this.numeroSiege = numeroSiege;
    }
}
