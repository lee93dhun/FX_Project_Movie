package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;


import DAO.MovieDao;
import domain.Movie;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Timecontroller implements Initializable {
	
	 int moviecode1 = Maincontroller.GetInstance().getMoviecode1();
	 int moviecode2 = Maincontroller.GetInstance().getMoviecode2();
	 int moviecode3 = Maincontroller.GetInstance().getMoviecode3();
	 
	 int buttonch = Maincontroller.GetInstance().getbuttonch();
	 
	 public static int timech = 0;
	 
	 public static int getTimech() {
		return timech;
	}
	 
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		MovieDao movieDao = new MovieDao();
		
		Movie movie = new Movie();
		
		
		if( buttonch == 1 ) {
			
			movie = movieDao.getmovie2(moviecode1);
			
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			Image image = new Image(movie.getMimage());
			img_t_movie.setImage(image);
			
			btntime_1.setText("07 : 00");
			btntime_2.setText("13 : 30");
			btntime_3.setText("20 : 30");
				
		}else if (  buttonch == 2 ) {
			movie = movieDao.getmovie2(moviecode2);
			
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			Image image = new Image(movie.getMimage());
			img_t_movie.setImage(image);
				
			btntime_1.setText("09 : 00");
			btntime_2.setText("16 : 00");
			btntime_3.setText("22 : 30");
			
		}else if (  buttonch == 3 ) {
			movie = movieDao.getmovie2(moviecode3);
			
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			Image image = new Image(movie.getMimage());
			img_t_movie.setImage(image);
			
			btntime_1.setText("11 : 00");
			btntime_2.setText("18 : 30");
			btntime_3.setText("24 : 30");
		}
		
		
	}
	@FXML
    private ImageView img_t_movie;

    @FXML
    private Label lbl_t_title;

    @FXML
    private Label lbl_t_rating;

    @FXML
    private Label lbl_t_genre;

    @FXML
    private Label lbl_t_outline;

    @FXML
    private Label lbl_t_release;

    @FXML
    private Button btntime_1;

    @FXML
    private Button btntime_2;

    @FXML
    private Button btntime_3;
    
    @FXML
    private Button btnbefore;

    @FXML
    private Button btnnext;
    

    @FXML
    void before(ActionEvent event) {
			
			Maincontroller.GetInstance().loadpage("Main");

    }

    @FXML
    void next(ActionEvent event) {
    	
    	Maincontroller.GetInstance().loadpage("seat");
    	

    }
    
    public static String 색상1 = "-fx-border-color: #FFFFFF";
    public static String 색상2 = "-fx-background-color: #FFFFFF";
    
    
    
    @FXML
    void time_1(ActionEvent event) {
    	timech = 1;
    	if(buttonch == 1) {
    		btntime_1.setText("07 : 00");
    		System.out.println(btntime_1);
    	}
    	else if(buttonch == 2) {
    		btntime_2.setText("13 : 30");
    		System.out.println(btntime_2);
    	}
    	else if(buttonch == 3) {
    		btntime_3.setText("20 : 30");
    		System.out.println(btntime_3);
    	}
    	btntime_1.setStyle(색상1);
    	btntime_2.setStyle(색상2);
    	btntime_3.setStyle(색상2);
    	
    	

    }

    @FXML
    void time_2(ActionEvent event) {
    	timech = 2;
      	btntime_1.setStyle(색상2);
    	btntime_2.setStyle(색상1);
    	btntime_3.setStyle(색상2);
    }

    @FXML
    void time_3(ActionEvent event) {
    	timech = 3;
      	btntime_1.setStyle(색상2);
    	btntime_2.setStyle(색상2);
    	btntime_3.setStyle(색상1);
    }


	
	

	

	
	

}
