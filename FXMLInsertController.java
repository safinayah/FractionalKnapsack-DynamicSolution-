/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication23;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ayah
 */
public class FXMLInsertController implements Initializable {

    @FXML
    private Button Inser;
    @FXML
    private TextField maxlbl;
    @FXML
    private Button ans;
    @FXML
    private Label answer;
  
    @FXML
    private Button closeButton;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    FileAccess f;
    Knapsack n ;
 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      f= new FileAccess(); 
      n = f.pass(); 
    }

    @FXML
    private void InsertMax(ActionEvent event) {
   
        int[] time = n.getTime();
        int []weight = n.getProfit();
        

        n.setMaxTime(Integer.parseInt(maxlbl.getText()));
        int [][]arr = n.res(n.getMaxTime());
        System.out.println(arr[weight.length-1][n.getMaxTime()-1]);
        answer.setText(""+arr[weight.length-1][n.getMaxTime()-1]);
        System.out.println(Arrays.deepToString(n.res(n.getMaxTime())));

    }

    @FXML
    private void Answer(ActionEvent event) {

//                System.out.println("hhhhh");
//                System.out.println(Arrays.deepToString(arr));
//
    }



    @FXML
    private void closeButonAction(ActionEvent event) {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
