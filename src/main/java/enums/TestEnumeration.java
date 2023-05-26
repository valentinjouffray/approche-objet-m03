package enums;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for (Saison s: saisons){
            System.out.println(s);
        }

        // Partie 2
        String nom = "ETE";
        Saison ete = Saison.valueOf(nom);
        System.out.println(ete.getLibelle());

        // Partie 3
        Saison resultat = Saison.rechercherSaisonParLibelle("Hiver");
        System.out.println(resultat);
    }
}
