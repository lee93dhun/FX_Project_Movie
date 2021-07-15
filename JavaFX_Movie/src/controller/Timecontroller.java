package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Timecontroller implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	@FXML
    private ImageView img_t_movie;

    @FXML
    private Label txt_t_title;

    @FXML
    private Label txt_t_rating;

    @FXML
    private Label txt_t_genre;

    @FXML
    private Label txt_t_outline;

    @FXML
    private Label txt_t_release;

    @FXML
    private MenuButton btntimebox;

    @FXML
    private MenuItem mitime_1;

    @FXML
    private MenuItem mitime_2;

    @FXML
    private MenuItem mitime_3;

    @FXML
    private Button btnbefore;

    @FXML
    private Button btnnext;

    @FXML
    void before(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("되돌아가시겠습니까?");
		alert.setHeaderText("뒤로가기");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			try {
				Stage stage = new Stage();
				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Main.fxml"));
				Scene scene = new Scene(parent);
				stage.setResizable(false);
				stage.setTitle("POPCORN CINEMA : selet movie");
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

    }

    @FXML
    void next(ActionEvent event) {
    	try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/seat.fxml"));
			Scene scene = new Scene(parent);
			stage.setResizable(false);
			stage.setTitle("POPCORN CINEMA : selet seat");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void time_1(ActionEvent event) {

    }

    @FXML
    void time_2(ActionEvent event) {

    }

    @FXML
    void time_3(ActionEvent event) {

    }

	

	
	

}
