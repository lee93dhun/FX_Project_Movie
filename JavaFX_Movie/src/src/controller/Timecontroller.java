package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Timecontroller implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@FXML
	private ImageView img;

	@FXML
	private MenuButton btntimebox;

	@FXML
	private MenuButton btnperson;

	@FXML
	private MenuButton btnyouth;

	@FXML
	private Button btnbefore;

	@FXML
	private Button btnnext;

	@FXML
	void before(ActionEvent event) {

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
	void person(ActionEvent event) {
		

	}

	@FXML
	void timebox(ActionEvent event) {

	}

	@FXML
	void youth(ActionEvent event) {

	}

}
