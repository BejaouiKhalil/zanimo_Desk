/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.zanimo.gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pi.zanimo.entities.Accessory;
import pi.zanimo.services.UserService;
import pi.zanimo.util.Session;

/**
 * FXML Controller class
 *
 * @author danml
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton btnLogin;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField psw;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void doLogin(ActionEvent event) throws IOException {
        if(UserService.login(email.getText(), psw.getText())){
            btnLogin.getScene().getWindow().hide();
            Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
            Stage mainStage=new Stage();
            Scene scene=new Scene(root);
            mainStage.setScene(scene);
            mainStage.show();
            Session.getInstance().getCart().addProduct(new Accessory(1, "test", "test", 5, "uploads/d4c30c709fc3680713dc2d25ff50db9f.jpeg", "uploads/d4c30c709fc3680713dc2d25ff50db9f.jpeg", 50, null), 2);
        }else{
            System.out.println("FAILEDDDDDD");
        }
    }
    
}
