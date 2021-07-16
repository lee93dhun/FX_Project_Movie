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
import javafx.stage.Stage;

public class Timecontroller implements Initializable {
	
	public int mno;
	 int moviecode1 = Maincontroller.GetInstance().getMoviecode1();
	 int moviecode2 = Maincontroller.GetInstance().getMoviecode2();
	 int moviecode3 = Maincontroller.GetInstance().getMoviecode3();
	 int buttonch = Maincontroller.GetInstance().getbuttonch();
	
	

	
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		MovieDao movieDao = new MovieDao();
		
		Movie movie=new Movie();
		
		
		if( buttonch == 1 ) {
			
			movie = movieDao.getmovie2(moviecode1);
			
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			Image image = new Image(movie.getMimage());
			img_t_movie.setImage(image);
				
		}else if (  buttonch == 2 ) {
			System.out.println(moviecode2);
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			img_t_movie.setImage(null);
			
		}else if (  buttonch == 3 ) {
			System.out.println(moviecode3);
			lbl_t_title.setText(movie.getMtitle());
			lbl_t_rating.setText(movie.getMrating());
			lbl_t_genre.setText(movie.getMgenre());
			lbl_t_outline.setText(movie.getMoutline());
			lbl_t_release.setText(movie.getMrelease());
			img_t_movie.setImage(null);
			
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
    private MenuButton btntimebox;

    @FXML
    private MenuItem mitime_1;

    @FXML
    private MenuItem mitime_2;

    @FXML
    private MenuItem mitime_3;

    @FXML
    private Button btnbefore;

    @FXML
    private Button btnnext;

    @FXML
    void before(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("되돌아가시겠습니까?");
		alert.setHeaderText("뒤로가기");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			
			Maincontroller.GetInstance().loadpage("Main");
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
    void time_1(ActionEvent event) {

    }

    @FXML
    void time_2(ActionEvent event) {

    }

    @FXML
    void time_3(ActionEvent event) {

    }

	

	
	

}
