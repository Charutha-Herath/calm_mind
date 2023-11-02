package lk.ijse.calmMind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateFormController {
    public AnchorPane createAccountPage;

    public void btnCreateOnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) createAccountPage.getScene().getWindow();
        createAccountPage.getChildren().clear();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
    }
}
