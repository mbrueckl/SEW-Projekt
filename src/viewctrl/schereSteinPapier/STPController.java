package viewctrl.schereSteinPapier;
import javafx.scene.image.Image;
import main.Main;
import model.schereSteinPapier.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class STPController implements Initializable {
    private STPModel model;

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
        showChoice(3);
    }

    @FXML
    void schere(ActionEvent event) {
        showWinner(1);
        showChoice(1);
    }
    @FXML
    void stein(ActionEvent event) {
        showWinner(2);
        showChoice(2);
    }
    @FXML
    private void back(ActionEvent event) throws IOException {
        Main.changeScene("/viewCtrl/home/home.fxml");
    }
    private void hoverEffect(Button button) {
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: #8fd46f;"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #b4ff94;"));
    }
    private void showWinner(int userInput){
        if(model.ergebnis(userInput)==1){
            geweinnerAnzeigeL.setText("Gewonnen :D");
            spielerIV.setImage(new Image("viewCtrl/schereSteinPapier/images/winner.jpg"));
            botIV.setImage(new Image("viewCtrl/schereSteinPapier/images/loser.jpg"));
        }else if(model.ergebnis(userInput)==-1){
            geweinnerAnzeigeL.setText("Verloren :(");
            spielerIV.setImage(new Image("viewCtrl/schereSteinPapier/images/loser.jpg"));
            botIV.setImage(new Image("viewCtrl/schereSteinPapier/images/winner.jpg"));
        }else{
            geweinnerAnzeigeL.setText("Unendschieden :P");
            spielerIV.setImage(new Image("viewCtrl/schereSteinPapier/images/loser.jpg"));
            botIV.setImage(new Image("viewCtrl/schereSteinPapier/images/loser.jpg"));
        }
    }
    private void showChoice(int userInput){
        if(userInput==1){
            userChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/schere.png"));
        }else if(userInput==2){
            userChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/stein.png"));
        }else {
            userChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/papier.png"));
        }
        if(model.getBotChoice()==1){
            botChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/schere.png"));
        }else if(model.getBotChoice()==2){
            botChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/stein.png"));
        }else {
            botChoiceIV.setImage(new Image("viewCtrl/schereSteinPapier/images/papier.png"));
        }
    }
}
