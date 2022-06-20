package com.IUCompteCara;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import static com.outils.CompteCara.nbCaractere;

/**
 * The type Nb cara controller.
 */
public class nbCaraController {
    /**
     * The Txt phrase 1.
     */
    @FXML
    private TextField txtPhrase1;
    /**
     * The Txt phrase 2.
     */
    @FXML
    private TextField txtPhrase2;
    /**
     * The Txt phrase 3.
     */
    @FXML
    private TextField txtPhrase3;
    /**
     * The Txt recherche.
     */
    @FXML
    private TextField txtRecherche;
    /**
     * The Txt resu.
     */
    @FXML
    private TextField txtResu;
    /**
     * The But lancer.
     */
    @FXML
    private Button butLancer;
    /**
     * The Chc phrase 1.
     */
    @FXML
    private CheckBox chcPhrase1;
    /**
     * The Chc phrase 2.
     */
    @FXML
    private CheckBox chcPhrase2;
    /**
     * The Chc phrase 3.
     */
    @FXML
    private CheckBox chcPhrase3;

    /**
     * On lancer recherche.
     */
    @FXML
    protected void onLancerRecherche() {
        int nb = 0;
        txtResu.setText("recherche lancer");
        if (chcPhrase1.isSelected()) {
            nb += nbCaractere(txtPhrase1.getText(), txtRecherche.getText());
        }
        if (chcPhrase2.isSelected()) {
            nb += nbCaractere(txtPhrase2.getText(), txtRecherche.getText());
        }
        if (chcPhrase3.isSelected()) {
            nb += nbCaractere(txtPhrase3.getText(), txtRecherche.getText());
        }
        txtResu.setText(String.valueOf(nb));
    }

    /**
     * On saisi recherche.
     *
     * @param keyEvent the key event
     */
    public void onSaisiRecherche(final KeyEvent keyEvent) {
        int longueur = txtRecherche.getLength();
        if (longueur >= 1) {
            txtRecherche.deletePreviousChar();
        }
    }
}
