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
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author BangKho
 */
public class PenarikanBankController implements Initializable {

    @FXML
    private Label tarik;
    @FXML
    private JFXButton keluar;
    @FXML
    private JFXButton transaksi;
    @FXML
    private JFXButton info;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       MainBankController b = new MainBankController();
        tarik.setText(b.getNilai());
    }    

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void transLain(ActionEvent event) {
    }

    @FXML
    private void infoTabungan(ActionEvent event) {
    }
    
}
