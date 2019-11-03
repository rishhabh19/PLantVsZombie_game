package sample;

import com.sun.webkit.dom.XPathResultImpl;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Plants Vs. Zombies");
        primaryStage.setScene(new Scene(root, 850, 575));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
