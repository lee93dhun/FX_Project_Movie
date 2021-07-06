module JavaFX_Movie {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	opens application to javafx.graphics, javafx.fxml;
	opens DAO to java.sql;
}
