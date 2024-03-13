package fr.ecole3il.rodez2023.gui.model;

import java.nio.file.Paths;

import static fr.ecole3il.rodez2023.filemanagement.RandomWordPicker.pickRandomWord;

/**
 * @author florian-chicot
 * Cette classe fournit des méthodes pour gérer les données du jeu du pendu.
 */
public class HangmanModel {
    private static final int MAX_ERRORS = 10;
    private int numberOfErrors;

    /**
     * Constructeur du modèle.
     */
    public HangmanModel() {
        this.numberOfErrors = 0;
    }

    /**
     * Récupère un mot aléatoire à deviner à partir d'un fichier.
     *
     * @return Le mot à deviner.
     */
    public String getWordToGuess() {
        // Nom du fichier contenant les mots
        String fileName = "mots.txt";

        // Récupère un mot aléatoire à partir du fichier
        return pickRandomWord(Paths.get(fileName));
    }


    /**
     * Incrémente le compteur d'erreurs.
     */
    public void incrementErrors() {
        this.numberOfErrors++;
    }

    /**
     * Vérifie si le joueur a perdu le jeu.
     *
     * @return true si le joueur a perdu, sinon false.
     */
    public boolean isGameLost() {
        return this.numberOfErrors >= MAX_ERRORS;
    }

    /**
     * Récupère le nombre d'erreurs.
     *
     * @return Le nombre d'erreurs.
     */
    public int getNumberOfErrors() {
        return this.numberOfErrors;
    }

}
