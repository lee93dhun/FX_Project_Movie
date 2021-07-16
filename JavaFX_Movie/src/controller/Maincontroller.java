package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAO.MovieDao;
import domain.Movie;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Maincontroller implements Initializable {
	
	private static Maincontroller instance;
	
	public Maincontroller() {
		instance = this;
	}
	public static Maincontroller GetInstance() {
		return instance;
	}
	
	public static int getMoviecode1() {
		return moviecode1;
	}
	public static int getMoviecode2() {
		return moviecode2;
	}
	public static int getMoviecode3() {
		return moviecode3;
	}
	
	public static int buttonch=0;
	
	
	
	public static int getbuttonch() {
		return buttonch;
	}

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		MovieDao movieDao = MovieDao.getmovieDao();
		ArrayList<Movie> movies = movieDao.main_movie( );
		
		for( int i = 0 ; i<3 ; i++ ) {
			
			Image image = new Image( movies.get(i).getMimage());
			if( i == 0 ) {
				movie_1.setImage( image );
				moviecode1 =  movies.get(i).getMno();
			}
			if( i == 1 ) {
				movie_2.setImage( image );
				moviecode2 =  movies.get(i).getMno();
			}
			if( i == 2 ) {
				movie_3.setImage( image );
				moviecode3 =  movies.get(i).getMno();
			}
			
		}
		
		

		

	}
	
	@FXML
	private BorderPane borderpane;
	
	@FXML
	private ImageView movie_1;

	@FXML
	private ImageView movie_2;

	@FXML
	private ImageView movie_3;

	@FXML
	private Button btnticketing_1;	static int moviecode1 = -1;

	@FXML
	private Button btnticketing_2;	static int moviecode2 = -1;

	@FXML
	private Button btnticketing_3;	static int moviecode3 = -1;

	@FXML
	void ticketing_1(ActionEvent event) {
		
		buttonch =1;
		loadpage("Time");
	}

	@FXML
	void ticketing_2(ActionEvent event) {
		buttonch =2;
		loadpage("Time");
	}

	@FXML
	void ticketing_3(ActionEvent event) {
		buttonch =3;
		loadpage("Time");
	}
	
	// 레이아웃 변경 메소드
	public void loadpage (String page) {
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/"+page+".fxml") );
			borderpane.setCenter(parent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
