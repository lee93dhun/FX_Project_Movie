package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class Maincontroller implements Initializable {
	
	private static Maincontroller instance;
	
	public Maincontroller() {
		instance = this;
	}
	public static Maincontroller getinstance() {
		return instance;
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			
		}catch (Exception e) {
			
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		// TODO Auto-generated method stub
		
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
    	loadpage("seat");
    }

    @FXML
    void ticketing_2(ActionEvent event) {

    }

    @FXML
    void ticketing_3(ActionEvent event) {

    }

}
