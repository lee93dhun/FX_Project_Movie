package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    void close(ActionEvent event) {

    }


}
