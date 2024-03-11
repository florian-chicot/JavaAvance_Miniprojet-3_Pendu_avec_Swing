package fr.ecole3il.rodez2023.filemanagement;

import java.nio.file.Path;
import java.util.List;
import java.util.Random;

import static fr.ecole3il.rodez2023.Utils.readFile;

public class RandomWordPicker {

    /**
     * Retourne le premier mot d'une ligne aléatoire dans un fichier.
     *
     * @param filePath Le chemin vers le fichier.
     * @return Le premier mot d'une ligne aléatoire.
     */
    public static String pickRandomWord(Path filePath) {
        // Lecture de toutes les lignes du fichier
        List<String> lines = readFile(filePath);

        // Génération d'un nombre aléatoire entre 0 et le nombre de lignes - 1
        Random random = new Random();
        int randomIndex = random.nextInt(lines.size());

        // Récupération de la ligne aléatoire
        String randomLine = lines.get(randomIndex);
        // Séparation de la ligne aléatoire en mots
        String[] words = randomLine.split("\\s+");

        // Retourne le premier mot de la ligne aléatoire
        return words[0];
    }

}
