package application.view.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController 
{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> deliveriesList;

    @FXML
    private ListView<String> pickupList;

    @FXML
    private Button schedulePickUp;

    @FXML
    private Button printSchedule;

    @FXML
    private Button settingsButton;

    @FXML
    private Button quitButton;

    @FXML
    void goToSchedue(ActionEvent event) throws IOException 
    {
    	/*
		 *  Loads the book trip window and displays it
		 */
	    Stage stage;
	    AnchorPane root = null;
	    stage = (Stage) schedulePickUp.getScene().getWindow();
				
	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(Main.class.getResource("view/ScheduleWindow.fxml"));
		root = (AnchorPane) loader.load();
		
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
    }

    @FXML
    void goToSettings(ActionEvent event) 
    {

    }

    @FXML
    void printSchedule(ActionEvent event) 
    {

    }

    @FXML
    void quitProgram(ActionEvent event) 
    {
    	/*
		 * Makes a new pop-up dialog box
		 */
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText("Quit Program");
		alert.setContentText("Are you sure you want to exit??");
		Optional<ButtonType> result = alert.showAndWait();
		
		/*
		 * If user clicks on the ok button
		 */
		if (result.get() == ButtonType.OK)
		{
			System.exit(0);		// Terminates the window
		} 
		/*
		 * Else user clicks on cancel
		 */
		else 
		{
		    alert.close();		// Alert is closed
	    }
    }

    @FXML
    void initialize()
    {
        assert deliveriesList != null : "fx:id=\"deliveriesList\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert pickupList != null : "fx:id=\"pickupList\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert schedulePickUp != null : "fx:id=\"schedulePickUp\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert printSchedule != null : "fx:id=\"printSchedule\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert settingsButton != null : "fx:id=\"settingsButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }
}
