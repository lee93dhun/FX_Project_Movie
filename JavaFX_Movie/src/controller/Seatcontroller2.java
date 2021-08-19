package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.CountDownLatch;
import DAO.MovieDao;
import domain.Movie;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
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
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Seatcontroller2 implements Initializable {
	
	private static Seatcontroller2 instance;
	public Seatcontroller2() {
		instance = this;
	}
	public static Seatcontroller2 GetInstance() {	
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
		
		Button[] btn =new Button[10];
		String[] btntext= {"1","2","3","4","5","6","7","8","9","10"};
		Font font = Font.font("Courier New", FontWeight.BOLD, 15);
		for(int i=0;i<10;i++) {
			btn[i] = new Button(btntext[i]);
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font);//폰트설정
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(73);
		}
		
		for(int i=0;i<10;i++) {
			btn[i] = new Button(btntext[i]);
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font);//폰트설정
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(123);
		}
		
		for(int i=0;i<10;i++) {
			btn[i] = new Button(btntext[i]);
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font);//폰트설정
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(173);
		}
		
		for(int i=0;i<10;i++) {
			btn[i] = new Button(btntext[i]);
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font);//폰트설정
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(223);
		}
		
		for(int i=0;i<10;i++) {
			btn[i] = new Button(btntext[i]);
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font);//폰트설정
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(273);
		}
		
		
		
		/*
		 * btn[1].setLayoutX(140); btn[1].setLayoutY(73); btn[2].setLayoutX(110);
		 * btn[2].setLayoutY(73); btn[3].setLayoutX(140); btn[3].setLayoutY(73);
		 * btn[4].setLayoutX(140); btn[4].setLayoutY(73); btn[5].setLayoutX(140);
		 * btn[5].setLayoutY(73); btn[6].setLayoutX(140); btn[6].setLayoutY(73);
		 * btn[7].setLayoutX(140); btn[7].setLayoutY(73); btn[8].setLayoutX(140);
		 * btn[8].setLayoutY(73); btn[9].setLayoutX(140); btn[9].setLayoutY(73);
		 * btn[10].setLayoutX(140); btn[10].setLayoutY(73);
		 */
		
		/*	
		Button btn = new Button(); 
		Font font = Font.font("Courier New", FontWeight.BOLD, 15);
		btn.setText("1");
		btn.setFont(font);
		btn.setPrefSize(40, 40);
		btn.setLayoutX(110);
		btn.setLayoutY(73);
		btn.setStyle("-fx-border-color:black;" +
				"-fx-background-color: #FFFFFF"); 
		
		btn.setOnAction( new EventHandler() {
			
			@Override
			public void handle( Event e ) {
				btn.setStyle("-fx-border-color: #DC143C;" +
						"-fx-background-color: #DC143C"); 
			
			}
		});
		
		pane.getChildren().add(btn);
		*/
		
		
		
		
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
	    
	    

}
