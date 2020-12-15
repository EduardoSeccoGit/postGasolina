/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import models.bomba;
/**
 *
 * @author Secco
 */
public class FXMLDocumentController implements Initializable {
    private bomba objBomba;
    @FXML private TextField precoGasolina;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.print(objBomba.getsValorLitro());
        precoGasolina.setText("sValorLitro");
    }
    @FXML
    private void setPrecoGasolinaText(MouseEvent event) {
        precoGasolina.setText(objBomba.getsValorLitro());
    }
}
