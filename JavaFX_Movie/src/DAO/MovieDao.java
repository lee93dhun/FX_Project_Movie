package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			String SQL = "insert into movie(mtitle,mgenre,moutline,mrelease,mrating,mprice,mimage,mcondition)"
					+ "values(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, movie.getMtitle());
			statement.setString(2, movie.getMgenre());
			statement.setString(3, movie.getMoutline());
			statement.setString(4, movie.getMrelease());
			statement.setString(5, movie.getMrating());
			statement.setInt(6, movie.getMprice());
			statement.setString(7, movie.getMimage());
			statement.setInt(8, movie.getMcondition());
			statement.executeUpdate();

			return 1;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	
	public Movie movie(String mtitle) {
		
		Movie movie = new Movie();
		
		String SQL = "select *from movie where mtitle=?";
		try {
		PreparedStatement statement = conn.prepareStatement(SQL);
		statement.setString(1, mtitle);
		
		ResultSet resultSet = statement.executeQuery();
		
		if(resultSet.next()) {
			movie.setMtitle(resultSet.getString(1));
			movie.setMgenre(resultSet.getString(2));
			movie.setMoutline(resultSet.getString(3));
			movie.setMrelease(resultSet.getString(4));
			movie.setMrating(resultSet.getString(5));
			movie.setMprice(resultSet.getInt(6));
			movie.setMimage(resultSet.getString(7));
			movie.setMcondition(resultSet.getInt(8));
			return movie;
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	

}
