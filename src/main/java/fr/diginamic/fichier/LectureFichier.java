package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {
        // "C:\Users\vajou\Downloads\recensement.csv"
        Path recensementFilePath = Paths.get("C:\\Users\\vajou\\Downloads\\recensement.csv");
        System.out.printf("File path: %s\n", recensementFilePath);
        List<String> lines;
        try {
            lines = Files.readAllLines(recensementFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lines.forEach(System.out::println);
    }
}
