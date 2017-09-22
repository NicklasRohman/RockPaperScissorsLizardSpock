package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Ai;
import model.Human;

/** 
 * @author Nicklas
 * Its a singleton class
 * Handles GUI for the popup window when player what help
 */
public class ResultBox {

	final int WINDOW_WIDTH = 1100; 
	final int WINDOW_HEIGHT = 1000;
	
	
	static ResultBox resultBox;
	
	private ResultBox() {		
	}
	
	/**
	 * the method to get a instance of the class
	 */
	public static ResultBox getInstance(){
		if(resultBox == null){
			resultBox = new ResultBox();
		}
		return resultBox;
	}
	
	/**
	 * The method display popup window
	 * @param message What it should stand on the label 
	 * @return boolean answer
	 */
	public boolean display(){
		Stage alertWindow = new Stage();
		Human human = Human.getInstance();
		Ai ai = Ai.getInstance();
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(WINDOW_WIDTH);
		alertWindow.setHeight(WINDOW_HEIGHT);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label playerLabel = new Label();
		Label aiLabel= new Label();
		Label playerPicLabel = new Label();
		Label aiPicLabel= new Label();
		Label resultLabel = new Label("ResultLabel");
		playerLabel.getStyleClass().add("resultBox");
		aiLabel.getStyleClass().add("resultBox");
		playerPicLabel.getStyleClass().add("resultLabel");
		aiPicLabel.getStyleClass().add("resultLabel");
		resultLabel.getStyleClass().add("resultBox");
		playerLabel.setText(human.getName());
		aiLabel.setText(ai.getName());
		playerPicLabel.getStyleClass().add(human.getHumanAnswer());
		playerPicLabel.getStyleClass().add("resultSize");
		aiPicLabel.getStyleClass().add(ai.getAiAnswer());
		aiPicLabel.getStyleClass().add("resultSize");
		Button okButton = new Button("OK"); 
		
		resultLabel.setAlignment(Pos.CENTER);
		okButton.setAlignment(Pos.CENTER);
		
		
		okButton.setOnAction(e ->{
			alertWindow.close();
			
		});		
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(30);
		pane.setVgap(30);
		pane.getStyleClass().add("borderPane");
		pane.setGridLinesVisible(true);
		
		pane.add(playerLabel, 0, 0);
		pane.add(aiLabel, 5, 0);
		pane.add(playerPicLabel, 0, 3);
		pane.add(aiPicLabel, 5, 3);
		pane.add(resultLabel, 3, 5);
		pane.add(okButton, 3, 6);
		
		Scene scene = new Scene(pane, WINDOW_WIDTH, WINDOW_HEIGHT);
		scene.getStylesheets().add("style.css");
		alertWindow.setScene(scene);
		alertWindow.showAndWait();
		
		
		return true;
		
	}
	
	private String backgroundPic(String cssResult){
		if (cssResult.equalsIgnoreCase("Rock")) {
			return "rock";
		}
		else if (cssResult.equalsIgnoreCase("Scissors")) {
			return "scissors";
		}
		else if (cssResult.equalsIgnoreCase("paper")) {
			return "paper";
		}
		else if (cssResult.equalsIgnoreCase("lizard")) {
			return "lizard";
		}
		else{
			return "spock";	
		}
		
	}
	
}
