package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationFormController {
    public AnchorPane root;
    public TextField txtUserName;
    public PasswordField txtPassword;
    public PasswordField txtConfirmPassword;
    public TextField txtAddress;
    public TextField txtContact;
    public RadioButton rdbtnCashier;
    public RadioButton rdbtnAdmin;

    public void initialize() {
        txtUserName.requestFocus();
    }

    public void btnRegisterOnAction(ActionEvent actionEvent) {
    }

    public void btnRegisterOnKeyPressed(KeyEvent keyEvent) {
    }

    public void registrationQuery() {

    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene= new Scene(parent);
   Stage primaryStage =  (Stage)root.getScene().getWindow();


    }
}
