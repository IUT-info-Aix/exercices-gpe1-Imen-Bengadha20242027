package fr.amu.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControl {

    @FXML
    private TextField userId;

    @FXML
    private PasswordField pwd;

    @FXML
    private void okClicked() {
        String username = userId.getText();
        String password = pwd.getText();
        System.out.println("Nom d'utilisateur : " + username);
        System.out.println("Mot de passe : " + "*".repeat(password.length()));
    }

    @FXML
    private void cancelClicked() {
        userId.clear();
        pwd.clear();
    }
}
