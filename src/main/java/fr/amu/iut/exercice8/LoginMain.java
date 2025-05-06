package fr.amu.iut.exercice8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class LoginMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Charger le fichier FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/exercice8/LoginView.fxml"));

        // Charger le GridPane à partir du fichier FXML
        GridPane root = fxmlLoader.load();

        // Créer la scène et la configurer
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("FXML Custom Control");
        stage.show();
    }
}
