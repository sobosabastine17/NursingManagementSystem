package com.example.esiama_community_nurse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class controller {
    @FXML
    Button btnStaffLogin,btnTutorLogout,btnAdminLogin;
    model Model = new model();
    int x,y;
    public void staffLogin(ActionEvent event) throws IOException {
        Model.changeScene(btnStaffLogin,"tutor.fxml");
    }
    public void logout(ActionEvent event) throws IOException {
        Model.changeScene(btnTutorLogout,"login.fxml");
    }
    public void lblLogout(MouseEvent event) throws IOException {
        Model.changeScene(btnTutorLogout,"login.fxml");
    }
    public void lblAdminLogin(MouseEvent event) throws IOException {
        Model.changeScene(btnStaffLogin,"admin_login.fxml");
    }
    public void goBack(MouseEvent event) throws IOException {
        Model.changeScene(btnAdminLogin,"login.fxml");
    }
    public void adminLogin(ActionEvent event) throws IOException {
        Model.changeScene(btnAdminLogin,"tutor.fxml");
    }

    @FXML
    public void MouseDrag(MouseEvent event){
        Node node= (Node) event.getSource();
        Stage stage= (Stage) node.getScene().getWindow();
        stage.setX(event.getScreenX()-x);
        stage.setY(event.getScreenY()-y);
    }
    @FXML
    public void closeWindow(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("CLOSE WINDOW!!");
        alert.setContentText("Are you sure you want to close this window?");
        alert.setHeight(250);
        alert.setWidth(500);
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.close();
            }
        });

    }
    @FXML
    public void mousePress(MouseEvent event){
        x=(int) event.getSceneX();
        y=(int) event.getSceneY();
    }
}
