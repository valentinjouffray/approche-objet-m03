package fr.diginamic.geometrie.entites;

public class Carre extends Rectangle {
    public Carre(double longueur) {
        super(longueur, longueur);
    }

    public double getLongueur() {
        return super.getLongueur();
    }

    public void setLongueur(double longueur) {
        super.setLongueur(longueur);
        super.setLargeur(longueur);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carre{");
        sb.append("longueur=").append(getLongueur());
        sb.append('}');
        return sb.toString();
    }
}
