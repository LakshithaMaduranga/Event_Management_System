package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginFormController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public RadioButton rdbtnAdmin;
    public RadioButton rdbtnCashier;
    public AnchorPane root;

    public void initialize() {
        txtUserName.requestFocus();
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        login();

    }


    public void login() throws IOException {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if (userName.equals("abc") && password.equals("123")) {
            System.out.println("Login Success!");
            txtUserName.clear();
            txtPassword.clear();
            Parent parent = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("../view/MainPageForm.fxml")));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) root.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.setTitle("Main Form");
            primaryStage.centerOnScreen();


        } else {

            System.out.println("User name or password invalid!");
            txtUserName.clear();
            txtPassword.clear();
            txtUserName.requestFocus();
        }
    }

    public void btnRegistrationOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("../view/RegistrationForm.fxml")));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Form");
        primaryStage.centerOnScreen();
    }
}
