package fr.diginamic.fichier;

import fr.diginamic.fichier.entities.Ville;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreerFichier {
    public static void main(String[] args) {
        Path recensementFilePath = Paths.get("C:\\Users\\vajou\\Downloads\\recensement.csv");
        List<String> first100Lines;
        try {
            first100Lines = Files.lines(recensementFilePath).limit(100).toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path first100LinesFilePath = Paths.get("C:\\Users\\vajou\\Downloads\\recensement100.csv");
        try {
            if (Files.exists(first100LinesFilePath)) {
                Files.delete(first100LinesFilePath);
            }
            Files.write(first100LinesFilePath, first100Lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean exists = Files.exists(first100LinesFilePath);
        System.out.printf("Le fichier %s a bien été créé : %b%n", first100LinesFilePath, exists);
        List<Ville> villeList = new ArrayList<>();
        List<String> lines;
        try {
            lines = Files.readAllLines(recensementFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // List<Ville> villeList = new ArrayList<>(lines.stream().map(CreerFichier::parseVille).toList());
        villeList.addAll(lines.stream().map(CreerFichier::parseVille).toList());
        // villeList.stream().limit(10).forEach(System.out::println);
        List<Ville> villeListSup25000 = villeList.stream().filter(ville -> ville != null && ville.getPopulation() > 25000).toList();
        Path recensement25000FilePath = Paths.get("C:\\Users\\vajou\\Downloads\\recensement25000.csv");
        try {
            if (Files.exists(recensement25000FilePath)) {
                Files.delete(recensement25000FilePath);
            }
            String header = "Nom;Code département;Nom région;Population";
            Files.write(recensement25000FilePath, List.of(header));
            Files.write(recensement25000FilePath, villeListSup25000.stream().map(ville -> String.join(";", ville.getNom(), ville.getCodeDepartement(), ville.getNomRegion(), String.valueOf(ville.getPopulation()))).collect(Collectors.toList()), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Ville parseVille(String line) {
        if (line.startsWith("Code")) {
            return null;
        }
        // Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;
        String[] column = line.split(";");
        String nom = column[6].trim();
        String codeDepartement = column[2].trim();
        String nomRegion = column[1].trim();
        int population = Integer.parseInt(column[9].replace(" ", ""));
        return new Ville(nom, codeDepartement, nomRegion, population);
    }
}
