package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private static BorderPane rootLayout;
	@Override
	public void start(Stage primaryStage) {
	try {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/usuarioFX.fxml"));
		rootLayout = loader.load();
		
		Scene scene = new Scene(rootLayout);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Program Title");
		
		primaryStage.show();
		
		} catch (Exception e){
			
		e.printStackTrace();}}
	
	public static void loadView(String fxmlFile) {

		try {

		FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));

		rootLayout.setCenter(loader.load());

		} catch (Exception e) {

		e.printStackTrace();

		}

		}
	public static void main(String[] args) {
		launch(args);
	}
}