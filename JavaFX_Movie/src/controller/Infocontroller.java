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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class Infocontroller implements Initializable {
	private String mtitle;
	private  int mno;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		MovieDao movieDao = MovieDao.getmovieDao();
		ReservationDao reservationDao = ReservationDao.getReservationDao();

		Movie movie = movieDao.getmovie(mtitle);
		Reservation reservation = reservationDao.getreservation(mno);

		lblselecttitle.setText(movie.getMtitle());
		lblselectgenre.setText(movie.getMgenre());
		lblselecttime.setText(reservation.getRtime());
		lblselectps.setText(String.valueOf(reservation.getPerson()));
		lblselectseat.setText(reservation.getMseat());
		lblprice.setText(String.valueOf(movie.getMprice()));

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
		alert.setContentText("����");
		alert.setHeaderText("����Ϸ�");
		alert.showAndWait();

		Alert alert2 = new Alert(AlertType.CONFIRMATION);
		alert2.setContentText("�����Ͻðڽ��ϱ�? [�ƴϿ並 ������ ùȭ������ ���ư�]");
		alert2.setHeaderText("����");

		Optional<ButtonType> result = alert2.showAndWait();
		if (result.get() == ButtonType.OK) {

		} else {
			Platform.exit();
		}

	}

}
