package fr.diginamic.geometrie.entites;

public class Rectangle implements ObjetGeometrique {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        String sb = "Rectangle{" + "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
        return sb;
    }

    @Override
    public double perimetre() {
        return (getLongueur() + getLargeur()) * 2;
    }

    @Override
    public double surface() {
        return getLongueur() * getLargeur();
    }
}
