package fr.ecole3il.rodez2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author florian-chicot
 * Classe utilitaire contenant des méthodes pour effectuer des opérations génériques.
 */
public class Utils {

    /**
     * Lit le contenu d'un fichier et le retourne sous forme de chaîne de caractères.
     *
     * @param filePath Le chemin vers le fichier à lire.
     * @return Le contenu du fichier sous forme de chaîne de caractères.
     */
    public static String readFile(Path filePath) {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        return fileContent.toString();
    }

}

