package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class AdminAddController implements Initializable{
	

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	  @FXML
	    private Button btnmadd;

	    @FXML
	    private TextField txttitle;

	    @FXML
	    private TextField txtgenre;

	    @FXML
	    private TextField txtoutline;

	    @FXML
	    private TextField txtrelease;

	    @FXML
	    private TextField txtrating;

	    @FXML
	    private TextField txtprice;

	    @FXML
	    private ImageView imgmovie;

	    @FXML
	    private Button btnupload;

	    @FXML
	    private Label lblpath;
	    
	    @FXML
	    private RadioButton rbtn_1;
	    
	    @FXML
	    private RadioButton rbtn_2;

	    @FXML
	    private ToggleGroup condition;


	    @FXML
	    void madd(ActionEvent event) {
	    	
	    	String mtitle = txttitle.getText();
	    	String mgenre = txtgenre.getText();
	    	String moutline = txtoutline.getText();
	    	String mrelease = txtrelease.getText();
	    	String mrating = txtrating.getText();
	    	int mcondition = 0;
	    	
	    	if( rbtn_1.isSelected() ) mcondition = 1;
	    	if( rbtn_2.isSelected() ) mcondition = 0;
	    	
	    	int mprice;
	    	
			try {
				 mprice = Integer.parseInt( txtprice.getText() );
				if (mtitle.equals("") || mgenre.equals("") || moutline.equals("") || mrelease.equals("")
						|| mrating.equals("") ) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setContentText(" [??????] ?????? ?????? ????????? ???????????? ");
					alert.setHeaderText("?????? ??????");
					alert.showAndWait(); // ?????? ?????? ?????????????????? ????????????
					return;
				}
				
			} catch (Exception e) {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText(" [ ??????] ??????/???????????? ????????? ?????? ");
				alert.setHeaderText("?????? ??????");
				alert.showAndWait(); // ?????? ?????? ?????????????????? ????????????
				return;
			}
			
			
			
 	    
	    AdminMovie movie = new AdminMovie( mtitle, mgenre, moutline, mrelease, mrating, mprice, mimage, mcondition );
    	
    	AdminMovieDao movieDao = AdminMovieDao.getmovieDao();
    	int result =  movieDao.addMovie(movie);
    	System.out.println( result );
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("?????? ????????? ?????????????????????. ");
		alert.setHeaderText("?????? ??????");
		alert.showAndWait(); // ?????? ?????? ?????????????????? ????????????
		AdminHomeController adminHomeController = AdminHomeController.getintance();
		adminHomeController.loadpage("AdminList");
		
		return;
	    	
	    

	    }
	    
	    @FXML
	    private Stage filestage;
	    private static String mimage;

	    @FXML
	    void upload(ActionEvent event) {
	    	
	    	FileChooser fileChooser = new FileChooser();
	    	
	    	fileChooser.getExtensionFilters().addAll( new ExtensionFilter("???????????? : Image File", "*.png" , "*jpg" ,"*gif") );

	    	File file = fileChooser.showOpenDialog(filestage);
	    	
	    	
	    		lblpath.setText( file.getPath() );
	    		mimage = file.toURI().toString();
	    		Image image = new Image(mimage);
	    		imgmovie.setImage(image);

	    }

}
