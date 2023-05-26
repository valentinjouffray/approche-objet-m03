package tri;

import java.util.Objects;

public class Pays implements Comparable<Pays> {
    private String nom;
    private int pop;
    private String continent;
    public Pays(String nom, int pop, String continent) {
        this.nom = nom;
        this.pop = pop;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pays)){
            return false;
        }
        Pays ville = (Pays) o;
        return Objects.equals(nom, ville.getNom()) && Objects.equals(pop, ville.getPop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pop);
    }

    public static void afficherNbDepartements(int x, int y){
        // Une méthode static a le droit d'utiliser d'autres méthodes static et des attributs statics.
    }

    @Override
    public int compareTo(Pays o) {
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

    public Pays(String nom) {
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

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
