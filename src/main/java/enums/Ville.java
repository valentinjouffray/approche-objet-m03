package enums;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int pop;
    private Continent continent;

    /**
     *
     * @param nom
     * @param pop
     */
    public Ville(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
        this.continent = Continent.INDETERMINE;
    }

    /**
     *
     * @param nom
     * @param pop
     */
    public Ville(String nom, int pop, Continent continent) {
        this.nom = nom;
        this.pop = pop;
        this.continent = continent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ville ville = (Ville) o;
        return pop == ville.pop && Objects.equals(nom, ville.nom) && Objects.equals(continent, ville.getContinent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pop);
    }

    @Override
    public int compareTo(Ville o) {
        // On utilise la méthode compareTo de la classe String
        // return this.nom.compareTo(o.getNom());

        if (this.pop > o.getPop()) {
            return 1;
        }
        else if (this.pop < o.getPop()){
            return -1;
        }
        return 0;
        //return this.pop - o.getPop();
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                ", continent=" + continent.getNom() +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public Continent getContinent() {
        return continent;
    }
}
