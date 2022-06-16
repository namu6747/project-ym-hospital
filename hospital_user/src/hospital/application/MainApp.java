package hospital.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		System.out.println("main check");
		Font.loadFont(getClass().getResourceAsStream("../view/css/nelnalizzychae2020.ttf"),14);
		Scene scene = new Scene(new User_Root(primaryStage));
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("영남병원");
		primaryStage.setResizable(false);
		primaryStage.show();

	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
