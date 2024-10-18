package fr.diginamic.banque.entites;

public class Compte {
    private float solde;
    private String numero;

    public Compte(String numero, float solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public float getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }

    private void setSolde(float solde) {
        this.solde = solde;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero='" + numero + '\'' +
                '}';
    }
}
