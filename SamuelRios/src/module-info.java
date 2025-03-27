module SamuelRios {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens Controller to javafx.graphics, javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
