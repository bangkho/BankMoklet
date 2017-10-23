/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author BangKho
 */
public class MainBankController implements Initializable {

    @FXML
    private JFXButton pilih50;
    @FXML
    private JFXButton pilih100;
    @FXML
    private JFXButton pilih250;
    @FXML
    private JFXButton pilih500;
    @FXML
    private JFXButton pilih750;
    @FXML
    private JFXButton pilih1000;
    @FXML
    private JFXButton transaksi;
    @FXML
    private JFXButton info;
    @FXML
    private JFXButton keluar;
    
    String nilai;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void rupiah1(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 50.000";
        } catch (Exception e){
        }
    }

    @FXML
    private void rupiah2(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 100.000";
        } catch (Exception e){
        }
    }

    @FXML
    private void rupiah3(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 250.000";
        } catch (Exception e){
        }
    }

    @FXML
    private void rupiah4(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 500.000";
        } catch (Exception e){
        }
    }

    @FXML
    private void rupiah5(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 750.000";
        } catch (Exception e){
        }
    }

    @FXML
    private void rupiah6(ActionEvent event) {
        try{
             ((Node)(event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("Penarikan.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 500);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Withdrawal");
                    stage.show();
                    nilai="Rp. 1.000.000";
        } catch (Exception e){
        }
    }
    public String getNilai(){
        return nilai;
    }
    @FXML
    private void transLain(ActionEvent event) {
    }

    @FXML
    private void infoTabungan(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
