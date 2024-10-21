package fr.diginamic.geometrie.entites;

public class Sphere implements Objet3D {
    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRayon(), 3);
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * getRayon();
    }

    @Override
    public double surface() {
        return 4 * Math.PI * Math.pow(getRayon(), 2);
    }

    @Override
    public String toString() {
        return String.format("Sphere{rayon=%.2f}", getRayon());
    }
}
