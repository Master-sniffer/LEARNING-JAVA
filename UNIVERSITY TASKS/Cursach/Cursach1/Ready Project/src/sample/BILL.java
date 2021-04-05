package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BILL {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Korea;

    @FXML
    private Button Btt;

    @FXML
    private TextField Logim;

    @FXML
    private PasswordField Paass;

    @FXML
    private Label ffff;

    @FXML
    void CLOSEIT(ActionEvent event) {
        try{
            Stage stages = (Stage) Btt.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stages.close();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void KillBill(ActionEvent event) {
        if (!Logim.getText().equals("") && !Paass.getText().equals("")) {
            DatabaseHandler dbhandler = new DatabaseHandler();
            int res;
            res=dbhandler.DeleteUser(Paass.getText(), Logim.getText());
            if (res>0){
                ffff.setText("We've Killed him, boss!");
            }
            else{
                ffff.setText("DAMN,BOSS,HE WAS SO MAD!");
            }
        }
    }

    @FXML
    void initialize() {

    }
}