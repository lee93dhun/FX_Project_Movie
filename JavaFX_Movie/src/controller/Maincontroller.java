package controller;

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
import javafx.stage.Stage;

public class Maincontroller implements Initializable {

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		MovieDao movieDao = MovieDao.getmovieDao();
		ArrayList<Movie> movies = movieDao.main_movie( );
		
		
		
//		Image image = new Image( movies.get(0).getMimage());
//		
//		while(true) {
//			movie_1.setImage(image);
//			movie_2.setImage(image);
//			movie_3.setImage(image);
//		}
//		
		
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
	private ImageView movie_1;

	@FXML
	private ImageView movie_2;

	@FXML
	private ImageView movie_3;

	@FXML
	private Button btnticketing_1;	int moviecode1 = -1;

	@FXML
	private Button btnticketing_2;	int moviecode2 = -1;

	@FXML
	private Button btnticketing_3;	int moviecode3 = -1;

	@FXML
	void ticketing_1(ActionEvent event) {
		System.out.println( " 선택한 영화는 : " + moviecode1 );
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Time.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("POPCORN CINEMA : select time");
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
			stage.setTitle("POPCORN CINEMA : select time");
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
			stage.setTitle("POPCORN CINEMA : select time");
			stage.show();
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
