package fr.diginamic.banque.entites;

public class Debit extends Operation {

    // Obligation d'appeler le constructeur
    // de la classe mère avec super(..)
    public Debit(String date, double montant) {
        super(date, montant);
    }

    public double recalculerSolde(double ancienSolde){
        return ancienSolde-getMontant();
    }

    @Override
    public String getType() {
        return "DEBIT";
    }

    @Override
    public void afficherSolde() {

    }

    @Override
    public String getInfos() {
        return "Coucou";
    }
}
