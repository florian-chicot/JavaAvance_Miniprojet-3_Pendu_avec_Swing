package fr.ecole3il.rodez2023.gui;

import fr.ecole3il.rodez2023.gui.controller.HangmanController;
import fr.ecole3il.rodez2023.gui.model.HangmanModel;
import fr.ecole3il.rodez2023.gui.view.HangmanView;

import javax.swing.*;

import static fr.ecole3il.rodez2023.gui.model.HangmanModel.getWordToGuess;

/**
 * @author florian-chicot
 * Classe responsable du lancement de l'application du jeu du Pendu.
 */
public class RunHangman extends JFrame {

    /**
     * Initialise et lance l'application du jeu du Pendu.
     */
    public RunHangman() {
        // Instanciation du modèle, de la vue et du contrôleur
        HangmanModel model = new HangmanModel();
        HangmanView view = new HangmanView();
        HangmanController controller = new HangmanController(model, view);

        // Configuration de la fenêtre Swing
        JFrame frame = new JFrame("Jeu du Pendu");
        // Ajout du panneau principal de la vue à la fenêtre
        frame.add(view.getMainPanel());
        // Définition de la taille de la fenêtre
        frame.setSize(800, 600);
        // Fermeture de l'application lors de la fermeture de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }

    /**
     * Point d'entrée de l'application.
     * @param args les arguments de la ligne de commande (non utilisés dans cette application)
     */
    public static void main(String[] args) {
        // Afficher le mot à deviner dans la console
        System.out.println(getWordToGuess());

        // Lancer l'application sur le thread de l'interface utilisateur
        SwingUtilities.invokeLater(RunHangman::new);
    }
}
