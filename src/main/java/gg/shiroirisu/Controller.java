package gg.shiroirisu;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	private Button btnDate;
	@FXML
	private TextField txtDate;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { }
	
	public void showDateTime(ActionEvent event) {
		System.out.println("btn clicked");
		txtDate.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString());
	}

}
