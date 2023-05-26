package enums;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New-York", 1556, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 47800, Continent.EUROPE));
        villes.add(new Ville("Narbonne", 53400, Continent.ASIE));
        villes.add(new Ville("Lyon", 484000, Continent.ASIE));
        villes.add(new Ville("Foix", 9700, Continent.EUROPE));
        villes.add(new Ville("Pau", 77200, Continent.OCEANIE));
        villes.add(new Ville("Marseille", 850700, Continent.AMERIQUE));
        villes.add(new Ville("Tarbes", 40600, Continent.AMERIQUE));

        for (Ville v: villes){
            System.out.println(v);
        }
    }
}
