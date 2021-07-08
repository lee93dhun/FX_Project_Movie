package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class Infocontroller implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
    @FXML
    private ImageView imgselectimg;

    @FXML
    private Label lblselecttitle;

    @FXML
    private Label lblselectgenre;

    @FXML
    private Label lblselecttime;

    @FXML
    private Label lblselectps;

    @FXML
    private Label lblselectseat;

    @FXML
    private Button btnclose;

    @FXML
    private Label lblprice;

    @FXML
    void close(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setContentText("종료");
    	alert.setHeaderText("종료");
    		Platform.exit();


    }


}
