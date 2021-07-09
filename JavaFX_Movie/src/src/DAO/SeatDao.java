package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Seat;

public class SeatDao {

	Connection conn;
	private static SeatDao  seatDao= new SeatDao();

	public static SeatDao getseatDao() {
		return seatDao;
	}

	public SeatDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addseat(Seat seat) {
		try {
			String SQL = "snum"+"value(snum)";
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, seat.getSnum());
			
			statement.executeUpdate();
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return 0;
	}

}
