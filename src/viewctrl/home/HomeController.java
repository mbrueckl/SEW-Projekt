package viewctrl.home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private TextField benutzernameTF;

    @FXML
    private TextField passwortTF;

    @FXML
    void anmelden(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void benutzerErstellen(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
}
