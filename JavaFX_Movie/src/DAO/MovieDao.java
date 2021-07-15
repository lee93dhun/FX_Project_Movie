package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx_movie?serverTime=UTC", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Movie getmovie2(int mno) {
		
		Movie movie = new Movie();
		
		String SQL = "select *from movie ";
		try {
		PreparedStatement statement = conn.prepareStatement(SQL);
		statement.setInt(1, mno);
		
		ResultSet resultSet = statement.executeQuery();
		
		if(resultSet.next()) {
			movie.setMno(resultSet.getInt(1));
			movie.setMtitle(resultSet.getString(2));
			movie.setMgenre(resultSet.getString(3));
			movie.setMoutline(resultSet.getString(4));
			movie.setMrelease(resultSet.getString(5));
			movie.setMrating(resultSet.getString(6));
			movie.setMprice(resultSet.getInt(7));
			movie.setMimage(resultSet.getString(8));
			movie.setMcondition(resultSet.getInt(9));
			return movie;
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public Movie getmovie(String mtitle) {
		
		Movie movie = new Movie();
		
		String SQL = "select *from movie ";
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
	
	//메인에 이미지 가져오는 메소드
	public ArrayList<Movie> main_movie() {
		String SQL = "select * from  movie where mcondition = 1";
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next() ) {
				Movie mainmovie = new Movie();
				
				mainmovie.setMno(resultSet.getInt(1));
				mainmovie.setMimage(resultSet.getString(8));
				
				movies.add(mainmovie);
			}
			return movies;
			
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
