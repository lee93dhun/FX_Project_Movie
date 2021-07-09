package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Reservation;

public class ReservationDao {
	
	Connection conn;
	private static ReservationDao reservationDao = new ReservationDao();
	
	public static ReservationDao getReservationDao() {
		return reservationDao;
	}
	
	public ReservationDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_movie?serverTime=UTC", "root", "1234");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Reservation getreservation(int mno) {
		
		Reservation reservation = new Reservation();
		
		String SQL = "select * from reservation where mno=?";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, mno);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				reservation.setMseat(resultSet.getString(2));
				reservation.setRtime(resultSet.getString(3));
				reservation.setPerson(resultSet.getInt(4));
				
				return reservation;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	

}
