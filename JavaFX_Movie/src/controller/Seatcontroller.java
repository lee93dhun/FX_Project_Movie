package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.CountDownLatch;
import DAO.MovieDao;
import domain.Movie;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Seatcontroller implements Initializable {
	
	private static Seatcontroller instance;
	public Seatcontroller() {
		instance = this;
	}
	public static Seatcontroller GetInstance() {	
		return instance;
	}
	 int moviecode1 = Maincontroller.getMoviecode1();
	 int moviecode2 = Maincontroller.getMoviecode2();
	 int moviecode3 = Maincontroller.getMoviecode3();
	 
	 int buttonch = Maincontroller.getbuttonch();
	 String timech = Timecontroller.timech;
		
	 public static int getmaxpeople() { return maxpeople; }
	 
	 MovieDao movieDao = new MovieDao();
	 Movie movie = new Movie();
	 
	 public static int maxpeople = 0;
	 public static int getMaxpeople() {
		 return maxpeople;
	 }
	 public static int price = 0;
	 
	 
	 	
	@FXML
	private AnchorPane pane;
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Button btn = new Button();
		  btn.setText("seat2");
		  btn.setOnAction(new EventHandler<ActionEvent>() {
		  
			  @Override public void handle(ActionEvent arg0) {
				  Maincontroller.GetInstance().loadpage("seat2");} });
		  
		  pane.getChildren().add(btn);
		
		if( buttonch == 1 ) {
			movie = movieDao.getmovie2(moviecode1);
			price = movie.getMprice();
			
			lblselectmovie.setText(movie.getMtitle());
			lblselecttime.setText(timech);
			
			 
		}else if (  buttonch == 2 ) {
			movie = movieDao.getmovie2(moviecode2);
			price = movie.getMprice();
			
			lblselectmovie.setText(movie.getMtitle());
			lblselecttime.setText(timech);
			
		}else if (  buttonch == 3 ) {
			movie = movieDao.getmovie2(moviecode3);
			price = movie.getMprice();
			
			lblselectmovie.setText(movie.getMtitle());
			lblselecttime.setText(timech);
		}
	}
	@FXML
    void p_1(ActionEvent event) {
    	maxpeople = 1;
    	totalprice( price, maxpeople);
    } 

    @FXML
    void p_2(ActionEvent event) {
    	maxpeople = 2;
    	totalprice( price, maxpeople);
    }

    @FXML
    void p_3(ActionEvent event) {
    	maxpeople = 3;
    	totalprice( price, maxpeople);
    }

    @FXML
    void p_4(ActionEvent event) {
    	maxpeople = 4;
    	totalprice( price, maxpeople);
    }
    
    @FXML
    void p_5(ActionEvent event) {
    	maxpeople = 5;
    	totalprice( price, maxpeople);
    }

    @FXML
    void p_6(ActionEvent event) {
    	maxpeople = 6;
    	totalprice( price, maxpeople);
    }
    
    @FXML
    void p_7(ActionEvent event) {
    	maxpeople = 7;
    	totalprice( price, maxpeople);
    }

    @FXML
    void p_8(ActionEvent event) {
    	maxpeople = 8;
    	totalprice( price, maxpeople);
    }

    @FXML
    void p_9(ActionEvent event) {
    	maxpeople = 9;
    	totalprice( price, maxpeople);
    }
    
    @FXML
    void p_10(ActionEvent event) {
    	maxpeople = 10;
    	totalprice( price, maxpeople);
    }
	
	
	  public void totalprice( int price , int maxpeople ) {
	  
	  int totalprice = price*maxpeople;
	  
	  lblprice.setText( totalprice + " 원");
	  
	  } 
	 
	

	    @FXML
	    private ToggleGroup select_p;
	    
	    @FXML
	    private RadioButton rbtnp_1;

	    @FXML
	    private RadioButton rbtnp_2;

	    @FXML
	    private RadioButton rbtnp_3;

	    @FXML
	    private RadioButton rbtnp_4;
	    
	    @FXML
	    private RadioButton rbtnp_5;

	    @FXML
	    private RadioButton rbtnp_6;
	    
	    @FXML
	    private RadioButton rbtnp_7;

	    @FXML
	    private RadioButton rbtnp_8;

	    @FXML
	    private RadioButton rbtnp_9;

	    @FXML
	    private RadioButton rbtnp_10;

///////////////////////////////////////////////////////////SEAT A////////////////////////////
	    @FXML
	    private Button btnseat_a_1;

	    @FXML
	    private Button btnseat_a_2;

	    @FXML
	    private Button btnseat_a_3;

	    @FXML
	    private Button btnseat_a_4;

	    @FXML
	    private Button btnseat_a_5;

	    @FXML
	    private Button btnseat_a_6;

	    @FXML
	    private Button btnseat_a_7;

	    @FXML
	    private Button btnseat_a_8;

	    @FXML
	    private Button btnseat_a_9;

	    @FXML
	    private Button btnseat_a_10;
///////////////////////////////////////////////////////////SEAT B////////////////////////////
	    @FXML
	    private Button btnseat_b_1;

	    @FXML
	    private Button btnseat_b_2;

	    @FXML
	    private Button btnseat_b_3;

	    @FXML
	    private Button btnseat_b_4;

	    @FXML
	    private Button btnseat_b_5;

	    @FXML
	    private Button btnseat_b_6;

	    @FXML
	    private Button btnseat_b_7;

	    @FXML
	    private Button btnseat_b_8;

	    @FXML
	    private Button btnseat_b_9;

	    @FXML
	    private Button btnseat_b_10;
///////////////////////////////////////////////////////////SEAT C////////////////////////////
	    @FXML
	    private Button btnseat_c_1;

	    @FXML
	    private Button btnseat_c_2;

	    @FXML
	    private Button btnseat_c_3;

	    @FXML
	    private Button btnseat_c_4;

	    @FXML
	    private Button btnseat_c_5;

	    @FXML
	    private Button btnseat_c_6;

	    @FXML
	    private Button btnseat_c_7;

	    @FXML
	    private Button btnseat_c_8;

	    @FXML
	    private Button btnseat_c_9;

	    @FXML
	    private Button btnseat_c_10;
///////////////////////////////////////////////////////////SEAT D////////////////////////////
	    @FXML
	    private Button btnseat_d_1;

	    @FXML
	    private Button btnseat_d_2;

	    @FXML
	    private Button btnseat_d_3;

	    @FXML
	    private Button btnseat_d_4;

	    @FXML
	    private Button btnseat_d_5;

	    @FXML
	    private Button btnseat_d_6;

	    @FXML
	    private Button btnseat_d_7;

	    @FXML
	    private Button btnseat_d_8;

	    @FXML
	    private Button btnseat_d_9;

	    @FXML
	    private Button btnseat_d_10;
///////////////////////////////////////////////////////////SEAT E////////////////////////////
	    @FXML
	    private Button btnseat_e_1;

	    @FXML
	    private Button btnseat_e_2;

	    @FXML
	    private Button btnseat_e_3;

	    @FXML
	    private Button btnseat_e_4;

	    @FXML
	    private Button btnseat_e_5;

	    @FXML
	    private Button btnseat_e_6;

	    @FXML
	    private Button btnseat_e_7;

	    @FXML
	    private Button btnseat_e_8;

	    @FXML
	    private Button btnseat_e_9;

	    @FXML
	    private Button btnseat_e_10;
	    
	    @FXML
	    private Label lblselectmovie;

	    @FXML
	    private Label lblselecttime;
	    
	    @FXML
	    private Label lblprice;

	    @FXML
	    private Button btnbefore;

	    @FXML
	    private Button btnnext;

	    @FXML
	    void before(ActionEvent event) {
	    	Maincontroller.GetInstance().loadpage("Time");
	    }

	    @FXML
	    void next(ActionEvent event) {
	    	
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert( AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("좌석을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		Maincontroller.GetInstance().loadpage("ReserveInfo");
	    	}
	    }
	    

	   
	    
///////////////////////////////////////////////////////////SEAT A////////////////////////////
	    
	    public static String background_color = "-fx-background-color: #D03A3A";
	    public static String font_color = "-fx-text-fill: #FFFFFF";
	    
	    @FXML
	    void seat_a_1(ActionEvent event) {
	    	
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_1.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_2(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_2.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_3(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_3.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_4(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_4.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_5(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_5.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_6(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_6.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_7(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_7.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_8(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_8.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_9(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_9.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_a_10(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_a_10.setStyle(background_color);
	    	}
	    }
///////////////////////////////////////////////////////////SEAT B////////////////////////////
	    @FXML
	    void seat_b_1(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_1.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_2(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_2.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_3(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_3.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_4(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_4.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_5(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_5.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_6(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_6.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_7(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_7.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_8(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_8.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_b_9(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_9.setStyle(background_color);
	    	}
	    }
	    
	    @FXML
	    void seat_b_10(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_b_10.setStyle(background_color);
	    	}
	    }
///////////////////////////////////////////////////////////SEAT C////////////////////////////
	    @FXML
	    void seat_c_1(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_1.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_2(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_2.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_3(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_3.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_4(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_4.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_5(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_5.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_6(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_6.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_7(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_7.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_8(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_8.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_c_9(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_9.setStyle(background_color);
	    	}
	    }
	    
	    @FXML
	    void seat_c_10(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_c_10.setStyle(background_color);
	    	}
	    }

///////////////////////////////////////////////////////////SEAT D////////////////////////////
	    @FXML
	    void seat_d_1(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_1.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_2(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_2.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_3(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_3.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_4(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_4.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_5(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_5.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_6(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_6.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_7(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_7.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_8(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_8.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_d_9(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_9.setStyle(background_color);
	    	}
	    }
	    
	    @FXML
	    void seat_d_10(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_d_10.setStyle(background_color);
	    	}
	    }
///////////////////////////////////////////////////////////SEAT E////////////////////////////
	    @FXML
	    void seat_e_1(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_1.setStyle(background_color);
	    	}
	    }


	    @FXML
	    void seat_e_2(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_2.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_3(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_3.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_4(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_4.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_5(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_5.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_6(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_6.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_7(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_7.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_8(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_8.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_9(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_9.setStyle(background_color);
	    	}
	    }

	    @FXML
	    void seat_e_10(ActionEvent event) {
	    	if( maxpeople == 0 ) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("POPCPORN CINEMA");
	    		alert.setHeaderText("알림");
	    		alert.setContentText("관람인원을 선택해 주세요.");
	    		alert.show();
	    	}else {
	    		btnseat_e_10.setStyle(background_color);
	    	}
	    }
}
