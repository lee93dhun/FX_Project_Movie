package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.MovieDao;
import domain.Movie;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Seatcontroller implements Initializable {
	
	 int moviecode1 = Maincontroller.GetInstance().getMoviecode1();
	 int moviecode2 = Maincontroller.GetInstance().getMoviecode2();
	 int moviecode3 = Maincontroller.GetInstance().getMoviecode3();
	 int buttonch = Maincontroller.GetInstance().getbuttonch();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		MovieDao movieDao = new MovieDao();
		
		Movie movie = new Movie();
		
		if( buttonch == 1 ) {
			
			movie = movieDao.getmovie2(moviecode1);
			
			lblselectmovie.setText(movie.getMtitle());
			
		}else if (  buttonch == 2 ) {
			movie = movieDao.getmovie2(moviecode2);
			
			lblselectmovie.setText(movie.getMtitle());
				
			
		}else if (  buttonch == 3 ) {
			movie = movieDao.getmovie2(moviecode3);
			
			lblselectmovie.setText(movie.getMtitle());
			
		}

	}


	    @FXML
	    private ToggleGroup select_p;
	    
	    @FXML
	    private RadioButton rbtnp_1;

	    @FXML
	    private RadioButton rbtnp_2;

	    @FXML
	    private RadioButton rbtnp_3;

	    @FXML
	    private RadioButton rbtnp_4;
///////////////////////////////////////////////////////////SEAT A////////////////////////////
	    @FXML
	    private Button btnseat_a_1;

	    @FXML
	    private Button btnseat_a_2;

	    @FXML
	    private Button btnseat_a_3;

	    @FXML
	    private Button btnseat_a_4;

	    @FXML
	    private Button btnseat_a_5;

	    @FXML
	    private Button btnseat_a_6;

	    @FXML
	    private Button btnseat_a_7;

	    @FXML
	    private Button btnseat_a_8;

	    @FXML
	    private Button btnseat_a_9;

	    @FXML
	    private Button btnseat_a_10;
///////////////////////////////////////////////////////////SEAT B////////////////////////////
	    @FXML
	    private Button btnseat_b_1;

	    @FXML
	    private Button btnseat_b_2;

	    @FXML
	    private Button btnseat_b_3;

	    @FXML
	    private Button btnseat_b_4;

	    @FXML
	    private Button btnseat_b_5;

	    @FXML
	    private Button btnseat_b_6;

	    @FXML
	    private Button btnseat_b_7;

	    @FXML
	    private Button btnseat_b_8;

	    @FXML
	    private Button btnseat_b_9;

	    @FXML
	    private Button btnseat_b_10;
///////////////////////////////////////////////////////////SEAT C////////////////////////////
	    @FXML
	    private Button btnseat_c_1;

	    @FXML
	    private Button btnseat_c_2;

	    @FXML
	    private Button btnseat_c_3;

	    @FXML
	    private Button btnseat_c_4;

	    @FXML
	    private Button btnseat_c_5;

	    @FXML
	    private Button btnseat_c_6;

	    @FXML
	    private Button btnseat_c_7;

	    @FXML
	    private Button btnseat_c_8;

	    @FXML
	    private Button btnseat_c_9;

	    @FXML
	    private Button btnseat_c_10;
///////////////////////////////////////////////////////////SEAT D////////////////////////////
	    @FXML
	    private Button btnseat_d_1;

	    @FXML
	    private Button btnseat_d_2;

	    @FXML
	    private Button btnseat_d_3;

	    @FXML
	    private Button btnseat_d_4;

	    @FXML
	    private Button btnseat_d_5;

	    @FXML
	    private Button btnseat_d_6;

	    @FXML
	    private Button btnseat_d_7;

	    @FXML
	    private Button btnseat_d_8;

	    @FXML
	    private Button btnseat_d_9;

	    @FXML
	    private Button btnseat_d_10;
///////////////////////////////////////////////////////////SEAT E////////////////////////////
	    @FXML
	    private Button btnseat_e_1;

	    @FXML
	    private Button btnseat_e_2;

	    @FXML
	    private Button btnseat_e_3;

	    @FXML
	    private Button btnseat_e_4;

	    @FXML
	    private Button btnseat_e_5;

	    @FXML
	    private Button btnseat_e_6;

	    @FXML
	    private Button btnseat_e_7;

	    @FXML
	    private Button btnseat_e_8;

	    @FXML
	    private Button btnseat_e_9;

	    @FXML
	    private Button btnseat_e_10;
	    
	    @FXML
	    private Label lblselectmovie;

	    @FXML
	    private Label lblselecttime;

	    @FXML
	    private Label lblselectperson;
	    
	    @FXML
	    private Button btnbefore;

	    @FXML
	    private Button btnnext;

	    @FXML
	    void before(ActionEvent event) {
	    	Maincontroller.GetInstance().loadpage("Time");
	    }

	    @FXML
	    void next(ActionEvent event) {
	    	Maincontroller.GetInstance().loadpage("ReserveInfo");
	    }

	    @FXML
	    void p_1(ActionEvent event) {

	    }

	    @FXML
	    void p_2(ActionEvent event) {

	    }

	    @FXML
	    void p_3(ActionEvent event) {

	    }

	    @FXML
	    void p_4(ActionEvent event) {

	    }
///////////////////////////////////////////////////////////SEAT A////////////////////////////
	    @FXML
	    void seat_a_1(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_2(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_3(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_4(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_5(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_6(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_7(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_8(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_9(ActionEvent event) {

	    }

	    @FXML
	    void seat_a_10(ActionEvent event) {

	    }
///////////////////////////////////////////////////////////SEAT B////////////////////////////
	    @FXML
	    void seat_b_1(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_2(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_3(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_4(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_5(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_6(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_7(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_8(ActionEvent event) {

	    }

	    @FXML
	    void seat_b_9(ActionEvent event) {

	    }
	    
	    @FXML
	    void seat_b_10(ActionEvent event) {

	    }
///////////////////////////////////////////////////////////SEAT C////////////////////////////
	    @FXML
	    void seat_c_1(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_2(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_3(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_4(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_5(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_6(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_7(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_8(ActionEvent event) {

	    }

	    @FXML
	    void seat_c_9(ActionEvent event) {

	    }
	    
	    @FXML
	    void seat_c_10(ActionEvent event) {

	    }

///////////////////////////////////////////////////////////SEAT D////////////////////////////
	    @FXML
	    void seat_d_1(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_2(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_3(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_4(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_5(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_6(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_7(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_8(ActionEvent event) {

	    }

	    @FXML
	    void seat_d_9(ActionEvent event) {

	    }
	    
	    @FXML
	    void seat_d_10(ActionEvent event) {

	    }
///////////////////////////////////////////////////////////SEAT E////////////////////////////
	    @FXML
	    void seat_e_1(ActionEvent event) {

	    }


	    @FXML
	    void seat_e_2(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_3(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_4(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_5(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_6(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_7(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_8(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_9(ActionEvent event) {

	    }

	    @FXML
	    void seat_e_10(ActionEvent event) {
	    	
	    }
}
