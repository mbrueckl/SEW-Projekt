package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    static Scene scene;
    Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        changeScene("../viewctrl/home/home.fxml");
        stage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(fxml));
        scene = new Scene(root);
        stage.setScene(scene);

    }
}
