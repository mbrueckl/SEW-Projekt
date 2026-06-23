package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    static Scene scene;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root= FXMLLoader.load(getClass().getResource("../viewCtrl/home/home.fxml"));
        Parent root= FXMLLoader.load(getClass().getResource("../viewCtrl/schereSteinPapier/stp.fxml"));
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("SEW Projekt");
        //primaryStage.setFullScreen(true);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
    public static void changeScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(fxml));
        scene.setRoot(root);
    }
}
