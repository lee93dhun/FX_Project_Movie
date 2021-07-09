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
import javafx.scene.control.TextField;
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
	    void madd(ActionEvent event) {
	    	
	    	String mtitle = txttitle.getText();
	    	String mgenre = txtgenre.getText();
	    	String moutline = txtoutline.getText();
	    	String mrelease = txtrelease.getText();
	    	String mrating = txtrating.getText();
	    	
	    	int mprice;
	    	
			try {
				 mprice = Integer.parseInt( txtprice.getText() );
				if (mtitle.equals("") || mgenre.equals("") || moutline.equals("") || mrelease.equals("")
						|| mrating.equals("") ) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setContentText(" [ 오류] 입력 안된 항목이 있습니다 ");
					alert.setHeaderText("등록 실패");
					alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태
					return;
				}
				
			} catch (Exception e) {
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText(" [ 오류] 가격/재고에는 숫자만 입력 ");
				alert.setHeaderText("등록 실패");
				alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태
				return;
			}
			
			AdminHomeController adminHomeController = new AdminHomeController();
			adminHomeController.loadpage("AdminList");
 	    
	    AdminMovie movie
    	= new AdminMovie(mtitle, mgenre, moutline, mrelease, mrating, mprice, mimage);
    	
    	AdminMovieDao movieDao = AdminMovieDao.getmovieDao();
    	int result =  movieDao.addMovie(movie);
    	System.out.println( result );
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("영화 등록이 완료되었습니다. ");
		alert.setHeaderText("등록 완료");
		alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태
		return;
	    	
	    

	    }
	    
	    @FXML
	    private Stage filestage;
	    private static String mimage;

	    @FXML
	    void upload(ActionEvent event) {
	    	
	    	FileChooser fileChooser = new FileChooser();
	    	
	    	fileChooser.getExtensionFilters().addAll( new ExtensionFilter("그림파일 : Image File", "*.png" , "*jpg" ,"*gif") );

	    	File file = fileChooser.showOpenDialog(filestage);
	    	
	    	
	    		lblpath.setText( file.getPath() );
	    		mimage = file.toURI().toString();
	    		Image image = new Image(mimage);
	    		imgmovie.setImage(image);

	    }

}
