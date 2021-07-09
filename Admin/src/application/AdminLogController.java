package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLogController implements Initializable{
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	 @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField txtpw;

	    @FXML
	    private Button btnlogin;

	    @FXML
	    void login(ActionEvent event) {
	    	
	    	if( txtid.getText().equals("admin") && txtpw.getText().equals("1111") ) {
	    		
	    		btnlogin.getScene().getWindow().hide();	// 스테이지 끄기
	    		try {
		    		Stage stage = new Stage();
					Parent parent = FXMLLoader.load(getClass().getResource("/application/AdminHome.fxml"));
					Scene scene = new Scene(parent);
					stage.setScene(scene);
					stage.setResizable(false);
					stage.setTitle("POPCORN CINEMA : ADMIN MENU");
					stage.show();
	    		}
	    		catch (Exception e) {
					// TODO: handle exception
				}
	    	}else{
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setContentText("관리자 아이디 혹은 비밀번호가 다릅니다");
	    		alert.setHeaderText("관리자 로그인 실패");
	    		alert.showAndWait();	
	    	}
	    	
	    	

	    }

}
