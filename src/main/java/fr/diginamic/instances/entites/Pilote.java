package fr.diginamic.instances.entites;

import java.util.Date;

public class Pilote {
    String prenom;
    String nom;
    Date dateLicence;

    public Pilote(String prenom, String nom, Date dateLicence) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateLicence = dateLicence;
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

    public Date getDateLicence() {
        return dateLicence;
    }

    public void setDateLicence(Date dateLicence) {
        this.dateLicence = dateLicence;
    }
}
