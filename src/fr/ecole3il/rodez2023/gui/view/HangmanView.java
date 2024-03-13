package fr.ecole3il.rodez2023.gui.view;

import fr.ecole3il.rodez2023.gui.model.HangmanModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author florian-chicot
 * Classe représentant la vue du jeu du Pendu.
 */
public class HangmanView extends JPanel {

    private JPanel mainPanel;
    private JLabel wordLabel;
    private JButton generateWordToGuessButton;
    private JLabel wordToGuessLabel;


    /**
     * Constructeur de la classe HangmanView.
     */
    public HangmanView() {
        this.mainPanel = new JPanel();
        this.generateWordToGuessButton = new JButton("Générer le mot à deviner");
        this.wordLabel = new JLabel("Mot à deviner : ");

        // Initialiser le libellé du mot à deviner avec une chaîne vide
        this.wordToGuessLabel = new JLabel();

        // Initialisation de l'interface graphique
        createGUI();
    }

    /**
     * Méthode pour créer l'interface graphique.
     */
    private void createGUI() {
        addButton(mainPanel, generateWordToGuessButton);
        addLabel(mainPanel, wordLabel);

        // Ajout d'un écouteur d'événements au bouton "Générer le mot à deviner"
        addButtonListener(e -> {
            // Supprimer le libellé du mot à deviner s'il existe déjà
            if (wordToGuessLabel != null) {
                mainPanel.remove(wordToGuessLabel);
            }

            // Rafraîchir l'interface graphique pour appliquer les modifications
            mainPanel.revalidate();
            mainPanel.repaint();

            // Récupérer le mot à deviner depuis le modèle
            String wordToGuess = HangmanModel.getWordToGuess();
            // Créer un nouveau libellé pour afficher le mot à deviner
            wordToGuessLabel = new JLabel(wordToGuess);
            // Ajouter le libellé du mot à deviner au panneau principal après le libellé initial
            addLabel(mainPanel, wordToGuessLabel);

            // Rafraîchir l'interface graphique pour afficher le nouveau libellé
            mainPanel.revalidate();
            mainPanel.repaint();
        }, generateWordToGuessButton);
    }

    /**
     * Méthode pour ajouter un bouton à un panneau.
     * @param panel Le panneau auquel ajouter le bouton.
     * @param button Le bouton à ajouter.
     */
    public void addButton(JPanel panel, JButton button) {
        panel.add(button);
    }

    /**
     * Méthode pour ajouter un libellé à un panneau.
     * @param panel Le panneau auquel ajouter le libellé.
     * @param label Le libellé à ajouter.
     */
    public void addLabel(JPanel panel, JLabel label) {
        panel.add(label);
    }

    /**
     * Ajoute un écouteur d'événements à un bouton spécifié.
     * @param listener L'écouteur d'événements à ajouter au bouton.
     * @param button Le bouton auquel ajouter l'écouteur d'événements.
     */
    public void addButtonListener(ActionListener listener, JButton button) {
        button.addActionListener(listener);
    }

    /**
     * Méthode pour obtenir le panneau principal.
     * @return Le panneau principal.
     */
    public JPanel getMainPanel() {
        return this.mainPanel;
    }
}
