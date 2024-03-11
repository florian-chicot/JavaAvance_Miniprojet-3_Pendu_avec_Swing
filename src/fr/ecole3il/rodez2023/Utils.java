package fr.ecole3il.rodez2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
    public static List<String> readFile(Path filePath) {
        // Liste pour stocker le contenu du fichier ligne par ligne
        List<String> fileContent = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line;
            // Lecture de chaque ligne du fichier
            while ((line = bufferedReader.readLine()) != null) {
                // Ajout de la ligne à la liste
                fileContent.add(line);
            }
        } catch (IOException e) {
            // Gestion des exceptions en cas d'erreur de lecture du fichier
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        // Retourne la liste contenant le contenu du fichier
        return fileContent;
    }

}
