package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class AdminListController implements Initializable{
	
	private static AdminListController instance;	// 임시객체
	
	public AdminListController() {
		instance = this;
	}
	public static AdminListController getinstance() {
		return instance;
	}
	public AdminMovie getadmiMovie() {
		return adminMovie;
	}
	
	@FXML
    private TableView<AdminMovie> tableview;
	
	private static AdminMovie adminMovie;
	
	AdminMovieDao adminMovieDao = AdminMovieDao.getmovieDao();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		AdminMovieDao adminMovieDao = AdminMovieDao.getmovieDao();
		ObservableList<AdminMovie> adminMovies = adminMovieDao.mfield();
		
		TableColumn tc = tableview.getColumns().get(0); // 첫번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mno"));
		
		tc = tableview.getColumns().get(1); // 두번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mtitle"));
		
		tc = tableview.getColumns().get(2); // 세번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mgenre"));
		
		tc = tableview.getColumns().get(3); // 네번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("moutline"));
		
		tc = tableview.getColumns().get(4); // 다섯번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mrelease"));
		
		tc = tableview.getColumns().get(5); // 여섯번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mrating"));
		
		tc = tableview.getColumns().get(6); // 일곱번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mprice"));
		
		tc = tableview.getColumns().get(7); // 여덣번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("mcondition"));

		// 테이블에 리스트 넣어주기  = setitems( observablelist 객체 )
		tableview.setItems(adminMovies); 
		// 테이블에 행 클릭했을때 이벤트 
			// tableview.setOnMouseClicked(  (MouseEvent evnet) -> {  실행코드 } );
		
		 tableview.setOnMouseClicked( (MouseEvent event) -> {
		 
		 if( event.getButton().equals( MouseButton.PRIMARY) ) { 
			 adminMovie =  tableview.getSelectionModel().getSelectedItem();
			 AdminHomeController adminHomeController = AdminHomeController.getintance();
			 adminHomeController.loadpage("AdminUpdate");
		 
		 
		 } } );
		 
		
	}
	
	 


}
