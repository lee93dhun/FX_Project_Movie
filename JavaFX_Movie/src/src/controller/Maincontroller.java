package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Maincontroller implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		

	}

	@FXML
	private ImageView img_1;

	@FXML
	private ImageView img_2;

	@FXML
	private ImageView img_3;

	@FXML
	private Button btnticketing_1;

	@FXML
	private Button btnticketing_2;

	@FXML
	private Button btnticketing_3;

	@FXML
	void ticketing_1(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Time_1.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("POPCORN CINEMA : 시간선택");
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@FXML
	void ticketing_2(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Time_1.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("POPCORN CINEMA : selet time");
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@FXML
	void ticketing_3(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Time_1.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("POPCORN CINEMA : 시간선택");
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
