package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class managerController {

    @FXML
    VBox showTables;
    @FXML
    private void appetizerAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("appetizers.fxml"));
        showTables.getChildren().setAll(pane);
    }
    @FXML
    private void dessertAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("desserts.fxml"));
        showTables.getChildren().setAll(pane);

    }
    @FXML
    private void drinkAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("drinks.fxml"));
        showTables.getChildren().setAll(pane);

    }
    @FXML
    private void pastaAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("pasta.fxml"));
        showTables.getChildren().setAll(pane);

    }
    @FXML
    private void pizzaAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("pizza.fxml"));
        showTables.getChildren().setAll(pane);

    }
    @FXML
    private void burgerAction() throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource("burger.fxml"));
        showTables.getChildren().setAll(pane);

    }
    @FXML
    Pane pane;
    @FXML
    Stage stage;
    @FXML
    public void logoutAction(javafx.event.ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Do you want to logout from Restaurant Management System?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)pane.getScene().getWindow();
            stage.close(); }
    }
    @FXML
    public void backAction(javafx.event.ActionEvent event)throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Back");
        alert.setHeaderText("Do you want to go BACK from this page?");
        if(alert.showAndWait().get() == ButtonType.OK){
            Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(new Scene(parent));
            window.show();
              }
    }

    }


