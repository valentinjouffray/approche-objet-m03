package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private float taux;
    public CompteTaux(String numero, float solde, float taux) {
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " CompteTaux{" +
                "taux=" + taux +
                '}';
    }

    public static void main(String[] args) {
        CompteTaux compteTaux = new CompteTaux("123456", 1000, 0.2f);
        System.out.println(compteTaux);
    }
}
