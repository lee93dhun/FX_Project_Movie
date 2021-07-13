package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addMovie(AdminMovie movie) {

		try {
			String SQL = "insert into movie(mtitle,mgenre,moutline,mrelease,mrating,mprice,mimage,mcondition)"+ "values(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, movie.getMtitle()); 		
			
			statement.setString(2, movie.getMgenre());		
			statement.setString(3, movie.getMoutline());	
			statement.setString(4, movie.getMrelease());	
			statement.setString(5, movie.getMrating());		
			statement.setInt(6, movie.getMprice());
			statement.setString(7, movie.getMimage());	
			statement.setInt(8, movie.getMcondition() );
			statement.executeUpdate();
			
			return 1;

		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		return 0;
	}
	
	
	// 모든 게시물 출력메소드
	public ObservableList<AdminMovie> mfield() {
		ObservableList<AdminMovie> adminMovies = FXCollections.observableArrayList();
		// 1.SQL 작성 
				String SQL ="select * from movie";
				// 2.SQL 조작 
				try {
					PreparedStatement statement = conn.prepareStatement(SQL);
				// 3.SQL 실행
				// 4.SQL 결과
					ResultSet resultSet =  statement.executeQuery(); // select 검색 => Query 결과
					// 5. 검색된 모든 게시물을 객체 => 리스트에 담기 
					while( resultSet.next() ) {
								// 검색결과의 다음 레코드가 존재하면 
						AdminMovie adminMovie = new AdminMovie();
						
							adminMovie.setMno( resultSet.getInt(1) );
							adminMovie.setMtitle( resultSet.getString(2));
							adminMovie.setMgenre( resultSet.getString(3));
							adminMovie.setMoutline( resultSet.getString(4));
							adminMovie.setMrelease( resultSet.getString(5));
							adminMovie.setMrating( resultSet.getString(6));
							adminMovie.setMprice( resultSet.getInt(7));
							adminMovie.setMimage( resultSet.getString(8));
							adminMovie.setMcondition( resultSet.getInt(9));
							
							
							adminMovies.add(adminMovie); // 리스트 담기 
					}
					
					return adminMovies; // 리스트 반환 
				}
				
				catch (Exception e) {
					// TODO: handle exception
				}
				
				return null; // db 오류시 null 반환 
			}
	
	//업데이트 메소드 
	public int updatemovie( AdminMovie adminMovie , AdminMovie adminMovie2 ) {
		
		// 1. SQL 작성
		String SQL = "update movie set mtitle=?,mgenre=?,moutline=?,mrelease=?,mrating=?,mprice=?,mimage=?,mcondition=? where mno = ?";
		//2. SQL 조작
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, adminMovie2.getMtitle() );
			statement.setString(2, adminMovie2.getMgenre() );
			statement.setString(3, adminMovie2.getMoutline() );
			statement.setString(4, adminMovie2.getMrelease() );
			statement.setString(5, adminMovie2.getMrating() );
			statement.setInt(6, adminMovie2.getMprice() );
			statement.setString(7, adminMovie2.getMimage() );
			statement.setInt(8, adminMovie2.getMcondition() );
			statement.setInt(9, adminMovie.getMno() );
			
			
			//3.SQL 실행
			statement.executeUpdate();
			//4.SQL 결과
			return 1; // 변경 성공
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // 실패 
	}
	
	// 영화 삭제 메소드
	
	public int delmovie( AdminMovie adminMovie) {
		String SQL = "delete from movie where mno =? ";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, adminMovie.getMno() );
			statement.executeUpdate();
			return 1;	// 성공
		}
		catch (Exception e) {
		}
		return 0 ;
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
