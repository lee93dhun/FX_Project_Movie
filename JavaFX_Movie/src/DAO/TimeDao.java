package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class TimeDao {

	Connection conn;
	private static MovieDao movieDao = new MovieDao();

	public static MovieDao getMovieDao() {
		return movieDao;
	}

	public TimeDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
