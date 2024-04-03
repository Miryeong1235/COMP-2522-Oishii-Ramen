package ca.bcit.comp2522.termproject.oishiiramen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StoreSettingController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField ownerNameTextField;

    public void switchToHiringEmployee(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("hiringEmployee.fxml"));

        String username = ownerNameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hiringEmployee.fxml"));
        root = loader.load();

        HiringEmployeeController hiringEmployeeController = loader.getController();
        hiringEmployeeController.displayName(username);


        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
