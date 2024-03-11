package fr.ecole3il.rodez2023.filemanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    /**
     * Compte le nombre de lignes dans un fichier spécifié.
     *
     * @param filePath Le chemin vers le fichier.
     * @return Le nombre de lignes dans le fichier.
     */
    public static int countLines(Path filePath) {
        int numberOfLine = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            while (bufferedReader.readLine() != null) {
                numberOfLine++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        return numberOfLine;
    }

    /**
     * Méthode principale pour tester la fonction countLines.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        String fileName = "mots.txt";
        Path filePath = Paths.get(fileName);

        System.out.println("Total number of line in " + fileName + " file: " + countLines(filePath));
    }

}
