package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.MovieDao;
import DAO.ReservationDao;
import domain.Movie;
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
		
		MovieDao movieDao = MovieDao.getmovieDao();
		ReservationDao reservationDao = ReservationDao.getReservationDao();
		
		Movie movie = movieDao.
		
		
		
				
		
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
    	alert.setContentText("결재");
    	alert.setHeaderText("결재완료");
    	alert.showAndWait();
    	
    	Alert alert2 = new Alert(AlertType.CONFIRMATION);
    	alert2.setContentText("종료하시겠습니까? [아니요를 누르면 첫화면으로 돌아감]");
    	alert2.setHeaderText("종료");
    	
    	Optional<ButtonType> result = alert2.showAndWait();
    	if(result.get() == ButtonType.OK) {
    		
    	}
    	else {
    		Platform.exit();
    	}
    		


    }


}
