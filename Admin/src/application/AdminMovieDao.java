package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AdminMovieDao {
	
	Connection conn;

	private static AdminMovieDao movieDao = new AdminMovieDao();

	public static AdminMovieDao getmovieDao() {
		return movieDao;
	}

	public AdminMovieDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx_movie?serverTime=UTC", "root", "1234");
			System.out.println("연동");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addMovie(AdminMovie movie) {

		try {
			String SQL = "insert into movie(mtitle,mgenre,moutline,mrelease,mrating,mprice,mimage,mcondition)"+ "values(?,?,?,?,?,?,?,?)";
			System.out.println("연동");
			PreparedStatement statement = conn.prepareStatement(SQL);
			System.out.println("연동");
			statement.setString(1, movie.getMtitle()); 		System.out.println( movie.getMtitle() );
			statement.setString(2, movie.getMgenre());		System.out.println( movie.getMgenre() );
			statement.setString(3, movie.getMoutline());	System.out.println( movie.getMoutline() );
			statement.setString(4, movie.getMrelease());	System.out.println( movie.getMrelease() );
			statement.setString(5, movie.getMrating());		System.out.println( movie.getMrating() );
			statement.setInt(6, movie.getMprice());			System.out.println( movie.getMprice() );
			statement.setString(7, movie.getMimage());		System.out.println( movie.getMimage() );
			statement.setInt(8, 0 );	
			statement.executeUpdate();
			System.out.println("연동");
			return 1;

		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return 0;
	}

}
