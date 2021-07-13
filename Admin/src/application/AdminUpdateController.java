package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class AdminUpdateController implements Initializable{
	
	
	private static AdminMovie adminMovie;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		adminMovie =  AdminListController.getinstance().getadmiMovie();
		
		// 각 컨트롤에 게시물 출력 
		txttitle.setText( adminMovie.getMtitle() );
		txtgenre.setText( adminMovie.getMgenre() );
		txtoutline.setText( adminMovie.getMoutline() );
		txtrelease.setText( adminMovie.getMrelease() );
		txtrating.setText( adminMovie.getMrating() );
		txtprice.setText(String.valueOf(adminMovie.getMprice()) );
		
		Image image = new Image( adminMovie.getMimage() );
		imgmovie.setImage( image );
		
		lblpath.setText(adminMovie.getMimage()); 
		
		mimage = adminMovie.getMimage();
		
		adminMovie.getMcondition();
		if(adminMovie.getMcondition() == 1) {
			rbtn_1.setSelected(true);
		}
		if(adminMovie.getMcondition() == 0) {
			rbtn_2.setSelected(true);
		}
		
		
	}
	
	 @FXML
	    private Button btnmupdate;

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
	    private Button btnmdelete;

	    @FXML
	    private Label lblpath;


	    @FXML
	    private ToggleGroup condition;

	    @FXML
	    private RadioButton rbtn_1;
	    
	    @FXML
	    private RadioButton rbtn_2;

	    @FXML
	    void mupdate(ActionEvent event) {
	    	
	    	
	    	
	    	AdminMovieDao adminMovieDao = AdminMovieDao.getmovieDao();
	    
	    	int condition = 0;
	    	if( rbtn_1.isSelected() ) { condition = 1;}
	    	if( rbtn_2.isSelected() ) { condition = 0;}
	    	
	    	
	    	
	    	
	    	AdminMovie adminMovie2 = new AdminMovie( adminMovie.getMno() , txttitle.getText(), txtgenre.getText(),txtoutline.getText(), txtrelease.getText()
	    			,txtrating.getText(),Integer.parseInt(txtprice.getText() ),mimage, condition  );   	
	    			
	    	int result = adminMovieDao.updatemovie(  adminMovie , adminMovie2 );
	    	if( result == 1 ) { // 수정 성공했을때 
	    		AdminHomeController.getintance().loadpage("AdminList");
	    	}else {	// 수정 실패했을때
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setHeaderText("영화 수정 실패");
	    		alert.setContentText("영화수정에 실패하였습니다.");
	    	}
	    	
	    	
	    }
	    
	    
	    @FXML
	    void mdelete(ActionEvent event) {
	    	
	    	AdminMovieDao adminMovieDao = AdminMovieDao.getmovieDao();
	    	int result = adminMovieDao.delmovie(adminMovie);
	    	if(result ==1 ) {
	    		AdminHomeController.getintance().loadpage("AdminList");
	    	}
	    	else {
	    		Alert alert = new Alert( AlertType.INFORMATION);
	    		alert.setContentText(" [ 삭제실패 ] ");
	    		alert.setHeaderText(" 영화 삭제 실패");
	    		alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 	
	    		AdminHomeController.getintance().loadpage("AdminList");
	    	}

	    }

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
