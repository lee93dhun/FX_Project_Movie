module JavaFX_Movie {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
