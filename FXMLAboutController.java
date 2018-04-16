/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication23;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ayah
 */
public class FXMLAboutController implements Initializable {

    @FXML
    private AnchorPane TimeLabel;
    @FXML
    private Label RelationLabel;
    @FXML
    private Button TimeComp;
    @FXML
    private Button rel;
    @FXML
    private Button closeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void about(ActionEvent event) {
    }

    @FXML
    private void relation(ActionEvent event) {
    }

    @FXML
    private void closeButtonAction(ActionEvent event) {
         // get a handle to the stage
    Stage stage = (Stage) closeButton.getScene().getWindow();
    // do what you have to do
    stage.close();
    }
    
}
