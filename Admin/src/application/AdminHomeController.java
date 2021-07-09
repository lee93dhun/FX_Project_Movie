package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AdminHomeController implements Initializable{
	
	public AdminHomeController() {}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	  	@FXML
	    private BorderPane borderpane;
	  	
	    @FXML
	    private Button btnadd;

	    @FXML
	    private Button btnlogout;

	    @FXML
	    private Button btnlist;

	    @FXML
	    void add(ActionEvent event) {
	    	loadpage("AdminAdd");

	    }

	    @FXML
	    void list(ActionEvent event) {
	    	loadpage("AdminList");
	    	
	    }
	    
	    @FXML
	    void logout(ActionEvent event) {
	    	
	    	btnlogout.getScene().getWindow().hide();
	    	
	    	try {
	    		Stage stage = new Stage();
				Parent parent = FXMLLoader.load(getClass().getResource("/application/AdminLog.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.setTitle("POPCORN CINEMA : ADMIN LOGIN");
				stage.show();
    		}
    		catch (Exception e) {
				// TODO: handle exception

    		}

	    }
	    
	 // 가운데 레이아웃변경 
	    public void loadpage( String page ) {
	    	try {
	    		Parent parent = FXMLLoader.load(getClass().getResource( "/application/"+page+".fxml"));
	    		borderpane.setCenter(parent);
	    	}
	    	catch (Exception e) {
				// TODO: handle exceptionqwe
			}
	    }
	


}
