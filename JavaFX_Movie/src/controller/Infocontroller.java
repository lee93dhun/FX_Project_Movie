package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.MovieDao;
import DAO.ReservationDao;
import domain.Movie;
import domain.Reservation;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Infocontroller implements Initializable {
	
	int moviecode1 = Maincontroller.GetInstance().getMoviecode1();
	 int moviecode2 = Maincontroller.GetInstance().getMoviecode2();
	 int moviecode3 = Maincontroller.GetInstance().getMoviecode3();
	
	int buttonch = Maincontroller.getbuttonch();
	int timech = Timecontroller.getTimech();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		MovieDao movieDao = new MovieDao();
		Movie movie = new Movie();
		
if( buttonch == 1 ) {
			
			movie = movieDao.getmovie2(moviecode1);

			lbltitle.setText(movie.getMtitle());
			lblrating.setText(movie.getMrating());
			lblgenre.setText(movie.getMgenre());
			lbloutline.setText(movie.getMoutline());
			Image image = new Image(movie.getMimage());
			imgmovieview.setImage(image);
			lblprice.setText(movie.getMprice()+" 원");
			
			
				
		}else if (  buttonch == 2 ) {
			movie = movieDao.getmovie2(moviecode2);
			
			lbltitle.setText(movie.getMtitle());
			lblrating.setText(movie.getMrating());
			lblgenre.setText(movie.getMgenre());
			lbloutline.setText(movie.getMoutline());
			Image image = new Image(movie.getMimage());
			imgmovieview.setImage(image);
			lblprice.setText(movie.getMprice()+" 원");
			
			
		}else if (  buttonch == 3 ) {
			movie = movieDao.getmovie2(moviecode3);

			lbltitle.setText(movie.getMtitle());
			lblrating.setText(movie.getMrating());
			lblgenre.setText(movie.getMgenre());
			lbloutline.setText(movie.getMoutline());
			Image image = new Image(movie.getMimage());
			imgmovieview.setImage(image);
			lblprice.setText(movie.getMprice()+" 원");
		}

	}

	@FXML
    private Button btnbefore;

    @FXML
    private Button btnconfirm;

    @FXML
    private ImageView imgmovieview;

    @FXML
    private Label lbltitle;

    @FXML
    private Label lblrating;

    @FXML
    private Label lblgenre;

    @FXML
    private Label lbloutline;

    @FXML
    private Label lblrnum;

    @FXML
    private Label lblprice;

    @FXML
    private Label lbltime;

    @FXML
    private Label lblsnum;

    @FXML
    void before(ActionEvent event) {
    	Maincontroller.GetInstance().loadpage("seat");
    }

    @FXML
    void confirm(ActionEvent event) {
    	
		
		 
    	Alert alert = new Alert( AlertType.CONFIRMATION);
    	alert.setTitle("예매완료");
    	alert.setHeaderText("예매가 완료 되었습니다.");
    	alert.setContentText("처음으로 돌아가시겠습니까?  [확인 : 처음으로 / 취소 : 종료하기]");
    	
    	
    	Optional<ButtonType> result = alert.showAndWait();
    	if( result.get() == ButtonType.OK) {
    		Maincontroller.GetInstance().loadpage("Main");
    		
    	}else {
    		Platform.exit();
    		
    	}
    	
    	
    	
    }
    

   
}
