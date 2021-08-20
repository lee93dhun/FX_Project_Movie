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
import javafx.scene.input.MouseEvent;
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
		
		Button[] btn =new Button[50];
		String[] btntext= {"1","2","3","4","5","6","7","8","9","10",
							"1","2","3","4","5","6","7","8","9","10",
							"1","2","3","4","5","6","7","8","9","10",
							"1","2","3","4","5","6","7","8","9","10",
							"1","2","3","4","5","6","7","8","9","10"};
		
		
		Font font = Font.font("Courier New", FontWeight.BOLD, 15);
		for(int i=0;i<50;i++) {
			
			btn[i] = new Button(btntext[i]);
			btn[i].setFont(font);
			pane.getChildren().add(btn[i]);
			btn[i].setPrefSize(40, 40);
			
			if( i<10  ) {
				btn[i].setLayoutX(80 + ((i+1)*55)); btn[i].setLayoutY(73);
			}else if( i< 20) {
				btn[i].setLayoutX(80 + ((i-10)+1)*55); btn[i].setLayoutY(123);
			}else if( i < 30) {
				btn[i].setLayoutX(80 + ((i-20)+1)*55); btn[i].setLayoutY(173);
			}else if( i < 40 ) {
				btn[i].setLayoutX(80 + ((i-30)+1)*55); btn[i].setLayoutY(223);
			}else if( i < 50 ) {
				btn[i].setLayoutX(80 + ((i-40)+1)*55); btn[i].setLayoutY(273);
			}
			
			/*Button btn =new Button();
			
			Font font = Font.font("Courier New", FontWeight.BOLD, 15);
			
			for(int i=0;i<50;i++) {
				
				btn.setText(String.valueOf(i));
				btn.setFont(font);
				btn.setPrefSize(40, 40);
				pane.getChildren().add(btn);
				if( i < 10 ) {
					btn.setLayoutX(80 + ( (i+1)*55) ); btn.setLayoutY(73);
				}else if( i < 20 ) {
					btn.setLayoutX(80 + ( (i-10)+1)*55 ); btn.setLayoutY(123);
				}else if( i < 30 ) {
					btn.setLayoutX(80 + ( (i-20)+1)*55 ); btn.setLayoutY(173);
				}else if( i < 40 ) {
					btn.setLayoutX(80 + ( (i-30)+1)*55 ); btn.setLayoutY(223);
				}else if( i < 50 ) {
					btn.setLayoutX(80 + ( (i-40)+1)*55 ); btn.setLayoutY(273);
				}
				
				*/
				
			/*
			 * btna[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
			 * 
			 * @Override public void handle(MouseEvent e) {
			 * btna[i].setStyle("-fx-background-color: #FFFFFF"); }
			 * 
			 * });
			 */
			 
				  
			
			
			/*
			 * btna[i].setOnAction(new EventHandler<ActionEvent>() {
			 * 
			 * @Override public void handle(ActionEvent event) { btna[i] = ; } });
			 */
			 
			
			
		}
		
		
		
		
		
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
