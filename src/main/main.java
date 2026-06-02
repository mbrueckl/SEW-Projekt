package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    static Scene scene;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../viewCtrl/home/home.fxml"));
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("SEW Projekt");
        primaryStage.show();
    }
    public void changeScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        scene = new Scene(root);
    }
}
