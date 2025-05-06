package fr.amu.iut.exercice9;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.SequentialTransition;

public class Animation extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        CustomButton customButton = new CustomButton();
        root.setCenter(customButton);
        Scene scene = new Scene(root, 400, 400);

        Duration duration = Duration.millis(1500);
        TranslateTransition transition1 = new TranslateTransition(duration, customButton);
        transition1.setByY(-150);
        transition1.setAutoReverse(true);
        transition1.setCycleCount(1);
        TranslateTransition transitionGauche = new TranslateTransition(duration, customButton);
        transitionGauche.setByX(150);
        TranslateTransition transitionD = new TranslateTransition(duration, customButton);
        transitionD.setByY(300);
        TranslateTransition transitionG = new TranslateTransition(duration, customButton);
        transitionG.setByX(-300);
        TranslateTransition transitionH = new TranslateTransition(duration, customButton);
        transitionH.setByY(-300);
        TranslateTransition transitionD1 = new TranslateTransition(duration, customButton);
        transitionD1.setByX(150);
        TranslateTransition transitionB = new TranslateTransition(duration, customButton);
        transitionB.setByY(150);

        SequentialTransition sequence = new SequentialTransition(transition1, transitionGauche, transitionD, transitionG, transitionH, transitionD1, transitionB);
        sequence.play();
        // Transitions en sens inverse (mêmes durées, mêmes objets, sens opposé)
        TranslateTransition inverseB = new TranslateTransition(duration, customButton);
        inverseB.setByY(-150);

        TranslateTransition inverseD1 = new TranslateTransition(duration, customButton);
        inverseD1.setByX(-150);

        TranslateTransition inverseH = new TranslateTransition(duration, customButton);
        inverseH.setByY(300);

        TranslateTransition inverseG = new TranslateTransition(duration, customButton);
        inverseG.setByX(300);

        TranslateTransition inverseD = new TranslateTransition(duration, customButton);
        inverseD.setByY(-300);

        TranslateTransition inverseGauche = new TranslateTransition(duration, customButton);
        inverseGauche.setByX(-150);

        TranslateTransition inverse1 = new TranslateTransition(duration, customButton);
        inverse1.setByY(150);
        SequentialTransition retour = new SequentialTransition(
                inverseB, inverseD1, inverseH, inverseG, inverseD, inverseGauche, inverse1
        );
        sequence.setOnFinished(e -> retour.play());





//        SequentialTransition st = new SequentialTransition(transition1, transition2, transition3, transition4, transition5);

        customButton.setOnMousePressed(mouseEvent -> transition1.play());

        primaryStage.setTitle("Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}