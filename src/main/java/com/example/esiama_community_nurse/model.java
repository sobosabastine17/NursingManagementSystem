package com.example.esiama_community_nurse;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class model {

    public void changeScene(Button btnKey, String fxml) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Stage window = (Stage) btnKey.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
