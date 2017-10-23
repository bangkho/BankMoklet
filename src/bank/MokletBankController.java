/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import com.jfoenix.controls.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author BangKho
 */
public class MokletBankController implements Initializable {

    @FXML
    private AnchorPane panel;
    @FXML
    private Label labelPin;
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btnc;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btnok;
    @FXML
    private JFXPasswordField fieldpin;
    @FXML
    private StackPane stack;

    String pin="";
    String mypin="3352";
    int kesempatan=3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void in1(ActionEvent event) {
        pin += "1";
        fieldpin.setText(pin);
    }

    @FXML
    private void in2(ActionEvent event) {
        pin += "2";
        fieldpin.setText(pin);
    }

    @FXML
    private void in4(ActionEvent event) {
        pin += "4";
        fieldpin.setText(pin);
    }

    @FXML
    private void in3(ActionEvent event) {
        pin += "3";
        fieldpin.setText(pin);
    }

    @FXML
    private void in5(ActionEvent event) {
        pin += "5";
        fieldpin.setText(pin);
    }

    @FXML
    private void in6(ActionEvent event) {
        pin += "6";
        fieldpin.setText(pin);
    }

    @FXML
    private void in7(ActionEvent event) {
        pin += "7";
        fieldpin.setText(pin);
    }

    @FXML
    private void in8(ActionEvent event) {
        pin += "8";
        fieldpin.setText(pin);
    }

    @FXML
    private void in9(ActionEvent event) {
        pin += "9";
        fieldpin.setText(pin);
    }

    @FXML
    private void cpin(ActionEvent event) {
        pin = "";
        fieldpin.setText(pin);
    }

    @FXML
    private void in0(ActionEvent event) {
        pin += "0";
        fieldpin.setText(pin);
    }

    @FXML
    private void okpin(ActionEvent event) {
        if((fieldpin.getText()).equals(mypin)){
             try{
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("MainBank.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Main Moklet Bank");
            stage.show();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        } else {
            kesempatan -=1;
            pin="";
            fieldpin.setText("");
            JFXDialogLayout content = new JFXDialogLayout();
            content.setHeading(new Text("PIN Anda Salah! Kesempatan "+kesempatan+" lagi"));
            JFXDialog dialog = new JFXDialog(stack,content,JFXDialog.DialogTransition.CENTER);
            dialog.show();
            stack.setDisable(false);
            if(kesempatan==0)
                System.exit(0);
            else if(kesempatan>0)
                stack.setDisable(false);
        }
       
    }
    
}
