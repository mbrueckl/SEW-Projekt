package viewctrl.schereSteinPapier;
import main.Main;
import model.schereSteinPapier.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class STPController implements Initializable {

    STPModel model;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new STPModel();
        hoverEffect(schereB);
        hoverEffect(steinB);
        hoverEffect(papierB);
    }
    @FXML
    private Button papierB;

    @FXML
    private Button schereB;

    @FXML
    private Button steinB;

    @FXML
    private Label benutzernameL;

    @FXML
    private ImageView botIV;

    @FXML
    private Label geweinnerAnzeigeL;

    @FXML
    private ImageView spielerIV;

    @FXML
    private ImageView userChoiceIV;

    @FXML
    private ImageView botChoiceIV;

    @FXML
    void papier(ActionEvent event) {
        showWinner(3);
    }

    @FXML
    void schere(ActionEvent event) {
        showWinner(1);
    }
    @FXML
    void stein(ActionEvent event) {
        showWinner(1);
    }
    @FXML
    void back(ActionEvent event) throws IOException {
        Main.changeScene("/viewCtrl/home/home.fxml");

    }
    private void hoverEffect(Button button) {
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: #8fd46f;"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #b4ff94;"));
    }
    private void showWinner(int userInput){
        if(model.ergebnis(userInput)==1){
            geweinnerAnzeigeL.setText("Gewonnen :D");
        }else if(model.ergebnis(userInput)==-1){
            geweinnerAnzeigeL.setText("Verloren :(");
        }else{
            geweinnerAnzeigeL.setText("Unendschieden :P");
        }
    }
}
