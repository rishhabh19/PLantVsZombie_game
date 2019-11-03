package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class Controller_start implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

    @FXML
    private Button play;

    @FXML
    private Button GoBack_Button;

    public  void Switch_to_play(ActionEvent event) throws IOException {
        Stage stage = (Stage) GoBack_Button.getScene().getWindow();
        stage.close();
        Parent pane=  FXMLLoader.load(getClass().getResource("game_lawn.fxml"));
        stage =new Stage();
        stage.setTitle("Plants Vs. Zombies");
        stage.setScene(new Scene(pane, 850, 575));
        stage.show();
    }

    public void Switch_To_Main(ActionEvent event) throws IOException {

        Stage stage = (Stage) GoBack_Button.getScene().getWindow();
        stage.close();

        Parent pane=  FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage =new Stage();
        stage.setTitle("Plants Vs. Zombies");
        stage.setScene(new Scene(pane, 850, 575));
        stage.show();
    }


}
