package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.printf("Temps écoulé en millisecondes pour StringBuilder : %d\n", (fin - debut));
        String chaine = "";
        debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            chaine += i;
        }
        fin = System.currentTimeMillis();
        System.out.printf("Temps écoulé en millisecondes pour String : %d\n", (fin - debut));
    }
}
