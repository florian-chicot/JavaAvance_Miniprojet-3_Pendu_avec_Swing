package fr.ecole3il.rodez2023.gui.model;

import java.nio.file.Paths;

import static fr.ecole3il.rodez2023.filemanagement.RandomWordPicker.pickRandomWord;

/**
 * @author florian-chicot
 * Cette classe fournit des méthodes pour gérer les données du jeu du pendu.
 */
public class HangmanModel {

    /**
     * Récupère un mot aléatoire à deviner à partir d'un fichier.
     *
     * @return Le mot à deviner.
     */
    public static String getWordToGuess() {
        // Nom du fichier contenant les mots
        String fileName = "mots.txt";

        // Récupère un mot aléatoire à partir du fichier
        return pickRandomWord(Paths.get(fileName));
    }

}
