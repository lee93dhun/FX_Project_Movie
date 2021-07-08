package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Movie;

public class MovieDao {

	Connection conn;
	private static MovieDao movieDao = new MovieDao();

	public static MovieDao getmovieDao() {
		return movieDao;
	}

	public MovieDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addMovie(Movie movie) {

		try {
			String SQL = "insert into movie(mtitle,mgenre,mouline,mrelease,mrating,mprice,mimage)"
					+ "values(?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, movie.getMtitle());
			statement.setString(2, movie.getMgenre());
			statement.setString(3, movie.getMoutline());
			statement.setString(4, movie.getMrelease());
			statement.setString(5, movie.getMrating());
			statement.setInt(6, movie.getMprice());
			statement.setString(7, movie.getMimage());
			statement.executeUpdate();

			return 1;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

}
