package fr.diginamic.geometrie.entites;

public class Cercle implements ObjetGeometrique{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cercle{");
        sb.append("rayon=").append(rayon);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double perimetre() {
        return getRayon() * 2 * Math.PI;
    }

    @Override
    public double surface() {
        return getRayon() * getRayon() * Math.PI;
    }
}
