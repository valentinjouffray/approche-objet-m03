package accesfichier;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class TestAccesFichier {

    public static final int VILLE = 4;
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("C:/Temp/recensement.csv"); // chemin d'accès à un fichier

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); // Table UNICODE
        for (String line: lines) {
            System.out.println(line);

            // 11;Île-de-France;95;2;09;241;Fontenay-en-Parisis;1 963;16;1 979;
            // Transformer une ligne de texte en instance de Ville
            String[] morceaux = line.split(";");

            // Pour la population : 1. transformer la String en int et 2. Suppression du caractère blanc dans les nombres replaceAll
        }

        // Word ou Excel : apache POI
        // PDF : iText



    }
}
