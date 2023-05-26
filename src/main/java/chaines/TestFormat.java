package chaines;

import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {
        String str1 = String.format("J'ai %7.2f € en poche", 2.5);
        String str2 = String.format(Locale.US, "J'ai %7.2f € en poche", 12.8);
        System.out.println(str1);
        System.out.println(str2);

        String nom = "Lee";
        String prenom = "Tim";
        float montant = 100.0f;

        StringBuilder builder = new StringBuilder();
        builder.append("Bonjour je m'appelle ").append(nom).append(" ").append(prenom).append(" et j'ai ").append(montant).append(" en poche");
        System.out.println(builder.toString());


    }
}
