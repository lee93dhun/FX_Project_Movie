package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ReservationDao {
	
	Connection conn;
	private static ReservationDao reservationDao = new ReservationDao();
	
	public static ReservationDao getReservationDao() {
		return reservationDao;
	}
	
	public ReservationDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC", "root", "1234");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
