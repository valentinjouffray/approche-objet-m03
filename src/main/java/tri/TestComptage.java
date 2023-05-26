package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.HashMap;

public class TestComptage {
    public static void main(String[] args) {
        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65, "Europe"));
        listePays.add(new Pays("Belgique", 10, "Europe"));
        listePays.add(new Pays("Australie", 20, "Océanie"));
        listePays.add(new Pays("Russie", 150, "Asie"));
        listePays.add(new Pays("Allemagne", 80, "Europe"));
        listePays.add(new Pays("Chine", 1400, "Asie"));
        listePays.add(new Pays("Indonésie", 220, "Océanie"));

        // Mise en place du comptage : nombre de pays par continents
        // Structure de la HashMap
        // - Clé: continent (String)
        // - Valeur : compteur (Integer)
        HashMap<String, Integer> compteurs = new HashMap<>();

        // Etape 1 : initialisation des compteurs
        for (Pays p: listePays) {
            // On teste si le compteur existe ou non pour le continent
            if (!compteurs.containsKey(p.getContinent())){
                // S'il n'existe pas je créé ce compteur
                compteurs.put(p.getContinent(), 0);
            }
        }
        System.out.println(compteurs);

        // Etape 2 : comptage
        for (Pays p: listePays) {
            String continent = p.getContinent();
            Integer compteur = compteurs.get(continent);
            compteur++;
            compteurs.put(continent, compteur);
        }
    }
}
