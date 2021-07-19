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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Infocontroller implements Initializable {
	private String mtitle;
	private int mno;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

//		MovieDao movieDao = MovieDao.getmovieDao();
//		ReservationDao reservationDao = ReservationDao.getReservationDao();
//
//		Movie movie = movieDao.getmovie(mtitle);
//		Reservation reservation = reservationDao.getreservation(mno);
//
//		lblselecttitle.setText(movie.getMtitle());
//		lblselectgenre.setText(movie.getMgenre());
//		lblselecttime.setText(reservation.getRtime());
//		lblselectps.setText(String.valueOf(reservation.getPerson()));
//		lblselectseat.setText(reservation.getMseat());
//		lblprice.setText(String.valueOf(movie.getMprice()));

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
	private Label lbloutline;

	@FXML
	void close(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("예매 완료");
		alert.setHeaderText("예매 완료");
		alert.showAndWait();

		Alert alert2 = new Alert(AlertType.CONFIRMATION);
		alert2.setContentText("종료하시겠습니까 ? [아니오를 누르면 첫화면으로 이동]");
		alert2.setHeaderText("종료");

		Optional<ButtonType> result = alert2.showAndWait();
		if (result.get() == ButtonType.OK) {
			Platform.exit();
		} else {
			try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Main.fxml"));
			Scene scene = new Scene(parent);
			stage.show();
			
		
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
