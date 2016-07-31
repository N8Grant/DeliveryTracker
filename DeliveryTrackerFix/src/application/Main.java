package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

public class Main extends Application 
{
	private Stage stage;

	@Override
	public void start(Stage primaryStage) 
	{
		/*
		 * Loads the main menu
		 */
		FXMLLoader loader;	// Used to load FXML file
		loader = new FXMLLoader(Main.class.getResource("view/MainMenu.fxml"));
		
		/*
		 * Try to load the window and set title
		 */
		try 
		{
			Parent root;
			root = loader.load();
			Scene scene = new Scene(root);
			stage = primaryStage;
			stage.setTitle("Delivery Tracker");
			stage.setScene(scene);
			stage.show();
		} 
		/*
		 * If window file cant be found
		 */
		catch (IOException e) 
		{
			e.printStackTrace();	// prints error to console
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
