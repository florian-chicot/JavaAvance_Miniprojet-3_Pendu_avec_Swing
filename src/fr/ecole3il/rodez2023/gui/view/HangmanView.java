package fr.ecole3il.rodez2023.gui.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author florian-chicot
 * Classe représentant la vue du jeu du Pendu.
 */
public class HangmanView extends JPanel {

    private JPanel mainPanel;
    private JLabel wordLabel;
    private JButton helloButton;


    /**
     * Constructeur de la classe HangmanView.
     */
    public HangmanView() {
        this.mainPanel = new JPanel();
        this.helloButton = new JButton("Hello World");
        this.wordLabel = new JLabel("Mot à deviner : ");

        // Initialisation de l'interface graphique
        createGUI();
    }

    /**
     * Méthode pour créer l'interface graphique.
     */
    private void createGUI() {
        addButton(mainPanel, helloButton);
        addLabel(mainPanel, wordLabel);
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
