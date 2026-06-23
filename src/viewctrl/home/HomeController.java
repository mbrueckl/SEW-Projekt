package viewctrl.home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.Main;
import model.CollectionHandling;
import model.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Label feedbackLabel;

    @FXML
    private TextField benutzernameTF;

    @FXML
    private TextField passwortTF;

    @FXML
    void benutzerErstellen(ActionEvent event) {
        String usernameInput = benutzernameTF.getText();
        String passwordInput = passwortTF.getText();
        User temp = col.findUser(usernameInput);
        if(!usernameInput.equals("") | !passwordInput.equals("")) {
            if (temp == null) {
                col.addUser(passwordInput, usernameInput);
                feedbackLabel.setText("User hinzugefügt!");
            } else {
                feedbackLabel.setText("Username existiert bereits!");
            }
        }else {
            feedbackLabel.setText("Benutzerfeld und Passwortfeld dürfen nicht leer sein.");
        }

    }

    @FXML
    void anmelden(ActionEvent event) throws IOException {
        String usernameInput = benutzernameTF.getText();
        String passwordInput = passwortTF.getText();

        User temp = col.findUser(usernameInput);

        if (temp != null && col.hashString(passwordInput).equals(temp.getPassword())){
            main.changeScene("../viewctrl/gameLauncher/gameLauncher.fxml");
        } else {
            feedbackLabel.setText("Benutzername oder Passwort ist falsch!!!");
        }

        benutzernameTF.setText("");
        passwortTF.setText("");

    }
    CollectionHandling col;
    Main main;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    col = new CollectionHandling();
    main = new Main();

    col.addUser("test","test");
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
}
