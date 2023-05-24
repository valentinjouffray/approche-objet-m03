package fr.diginamic.banque.entites;

public interface Contrat {

    public static final int VALUE=0; // constante

    public abstract void afficherSolde();

    public abstract String getInfos();
}
