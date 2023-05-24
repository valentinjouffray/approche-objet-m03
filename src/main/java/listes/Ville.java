package listes;

public class Ville {
    private String nom;
    private int pop;

    public Ville(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }

    public Ville(String nom) {
        this.nom = nom;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
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


}
