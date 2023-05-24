package fr.diginamic.banque.entites;

public class Credit extends Operation {

    // Obligation
    public Credit(String date, double montant) {
        super(date, montant);
    }

    public double recalculerSolde(double ancienSolde){
        return ancienSolde+getMontant();
    }

    @Override
    public String getType() {
        return "CREDIT";
    }

    @Override
    public void afficherSolde() {

    }

    public String getInfos(){
        return "Bla bla bla";
    }
}
