package application.view.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ScheduleController implements Initializable
{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker deliveryDate;

    @FXML
    private DatePicker pickupDate;

    @FXML
    private ComboBox<String> deliveryTime;

    @FXML
    private ComboBox<String> pickupTime;

    @FXML
    private TextField name;

    @FXML
    private Button continueBttn;

    @FXML
    private Button cancelBttn;

    @FXML
    private TextField address;

    @FXML
    void updateResults(KeyEvent event) 
    {

    }

    @FXML
    void initialize() 
    {
        assert deliveryDate != null : "fx:id=\"deliveryDate\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert pickupDate != null : "fx:id=\"pickupDate\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert deliveryTime != null : "fx:id=\"deliveryTime\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert pickupTime != null : "fx:id=\"pickupTime\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert continueBttn != null : "fx:id=\"continueBttn\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert cancelBttn != null : "fx:id=\"cancelBttn\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'ScheduleWindow.fxml'.";

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{	
		ObservableList<String> times = FXCollections.observableArrayList();
		times.addAll("9:00 AM", "10:00 AM", "11:00 AM",
					 "12:00 AM", "1:00 PM", "2:00 PM", "3:00 PM",
					 "4:00 PM", "5:00 PM");
		deliveryTime.setItems(times);
	}
}
