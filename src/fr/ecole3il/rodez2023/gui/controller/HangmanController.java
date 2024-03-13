package fr.ecole3il.rodez2023.gui.controller;

import fr.ecole3il.rodez2023.gui.model.HangmanModel;
import fr.ecole3il.rodez2023.gui.view.HangmanView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Contrôleur pour le jeu du Pendu.
 */
public class HangmanController {
    private HangmanModel model;
    private HangmanView view;

    /**
     * Constructeur de HangmanController.
     *
     * @param model Le modèle du jeu du Pendu.
     * @param view La vue du jeu du Pendu.
     */
    public HangmanController(HangmanModel model, HangmanView view) {
        this.model = model;
        this.view = view;

        // Ajout d'un ActionListener pour le bouton de génération du mot à deviner
        view.addGenereateWordToGuessButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mise à jour du label affichant le nombre d'erreurs
                view.setWordToGuessLabel(model.getWordToGuess());
            }
        });

        // Ajout d'un ActionListener pour le bouton d'incrémentation des erreurs
        view.addIncrementErrorsButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Incrémentation du nombre d'erreurs dans le modèle
                model.incrementErrors();
                // Mise à jour du label affichant le nombre d'erreurs
                view.setErrorsLabelText(model.getNumberOfErrors());
            }
        });
    }
}
