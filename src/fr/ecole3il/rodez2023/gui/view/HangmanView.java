package fr.ecole3il.rodez2023.gui.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author florian-chicot
 * Classe représentant la vue du jeu du Pendu.
 */
public class HangmanView extends JPanel {

    private JPanel mainPanel;
    private JLabel wordToGuessLabel;
    private JButton generateWordToGuessButton;
    private JButton incrementErrorsButton;
    private JLabel errorsLabel;

    /**
     * Constructeur de la classe HangmanView.
     */
    public HangmanView() {
        this.mainPanel = new JPanel();
        this.generateWordToGuessButton = new JButton("Générer le mot à deviner");
        this.wordToGuessLabel = new JLabel("Mot à deviner : ");
        this.incrementErrorsButton = new JButton("Incrémenter les erreurs");
        this.errorsLabel = new JLabel("Nombre d'erreurs : 0");

        // Initialisation de l'interface graphique
        createGUI();
    }

    /**
     * Méthode pour créer l'interface graphique.
     */
    private void createGUI() {
        addButton(mainPanel, generateWordToGuessButton);
        addLabel(mainPanel, wordToGuessLabel);
        addButton(mainPanel, incrementErrorsButton);
        addLabel(mainPanel, errorsLabel);
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
     * Méthode pour ajouter un ActionListener au bouton de génération du mot à deviner.
     * @param listener L'ActionListener à ajouter.
     */
    public void addGenereateWordToGuessButtonListener(ActionListener listener) {
        generateWordToGuessButton.addActionListener(listener);
    }

    /**
     * Méthode pour ajouter un ActionListener au bouton d'incrémentation des erreurs.
     * @param listener L'ActionListener à ajouter.
     */
    public void addIncrementErrorsButtonListener(ActionListener listener) {
        incrementErrorsButton.addActionListener(listener);
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
     * Méthode pour définir le libellé du mot à deviner.
     * @param wordToGuess Le mot à deviner.
     */
    public void setWordToGuessLabel(String wordToGuess) {
        wordToGuessLabel.setText("Mot à deviner : " + wordToGuess);
    }

    /**
     * Méthode pour définir le texte du libellé des erreurs.
     * @param errors Le nombre d'erreurs.
     */
    public void setErrorsLabelText(int errors) {
        errorsLabel.setText("Nombre d'erreurs : " + errors);
    }

    /**
     * Méthode pour obtenir le panneau principal.
     * @return Le panneau principal.
     */
    public JPanel getMainPanel() {
        return this.mainPanel;
    }
}
