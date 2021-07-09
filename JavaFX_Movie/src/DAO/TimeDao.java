package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Time;

public class TimeDao {

	Connection conn;
	private static TimeDao timeDao = new TimeDao();

	public static TimeDao gettimeDao() {
		return timeDao;
	}

	public TimeDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int addTime(Time time) {
		try {
			String SQL = "insert into time(rtime,tnum)"+"values(?,?)";
			
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, time.getRtime());
			statement.setInt(2, time.getTnum());
			statement.executeUpdate();
			return 1;
			

			
		}catch (Exception e) {

		}
		return 0;
	}


}
