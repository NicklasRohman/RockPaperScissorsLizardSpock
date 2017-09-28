package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Human;
import model.INewAi;

/**
 * @author Nicklas Its a singleton class Handles GUI for the popup window when
 *         player what help
 */
public class ResultBox {

	final int WINDOW_WIDTH = 1300;
	final int WINDOW_HEIGHT = 1000;

	static ResultBox resultBox;

	private ResultBox() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static ResultBox getInstance() {
		if (resultBox == null) {
			resultBox = new ResultBox();
		}
		return resultBox;
	}

	/**
	 * The method display popup window
	 * 
	 * @param theWinnerIs
	 * @param ai 
	 * @param message
	 *            What it should stand on the label
	 * @return boolean answer
	 */
	public boolean display(String theWinnerIs, INewAi ai) {
		Stage alertWindow = new Stage();
		Human human = Human.getInstance();
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(WINDOW_WIDTH);
		alertWindow.setHeight(WINDOW_HEIGHT);
		alertWindow.initStyle(StageStyle.UNDECORATED);

		Label playerLabel = new Label();
		Label aiLabel = new Label();
		Label playerPicLabel = new Label();
		Label aiPicLabel = new Label();
		Label resultLabel = new Label();
		Label leftSpaceLabel = new Label();
		Label rightSpaceLabel = new Label();
		
		leftSpaceLabel.getStyleClass().add("spaceLabel");
		rightSpaceLabel.getStyleClass().add("spaceLabel");
		
		playerLabel.getStyleClass().add("resultBox");
		playerPicLabel.getStyleClass().add("resultLabel");
		playerLabel.setText(human.getName());
		playerPicLabel.getStyleClass().add(human.getHumanAnswer());
		playerPicLabel.getStyleClass().add("resultSize");
		
		aiLabel.getStyleClass().add("resultBox");
		aiPicLabel.getStyleClass().add("resultLabel");
		aiLabel.setText("Ai");
		aiPicLabel.getStyleClass().add(ai.getAiAnswer());
		aiPicLabel.getStyleClass().add("resultSize");

		resultLabel.getStyleClass().add("resultBox");
		resultLabel.setText("The winner is: \n" + theWinnerIs);
		
		Button okButton = new Button("OK");

		resultLabel.setAlignment(Pos.CENTER);
		okButton.setAlignment(Pos.CENTER);

		okButton.setOnAction(e -> {
			alertWindow.close();

		});

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(30);
		pane.setVgap(30);
		pane.getStyleClass().add("borderPane");
		//pane.setGridLinesVisible(true);
		
		// grid system (column, row)
		pane.add(leftSpaceLabel, 0, 0);
		pane.add(playerLabel, 1, 0);
		pane.add(aiLabel, 3, 0);
		pane.add(playerPicLabel, 1, 3);
		pane.add(aiPicLabel, 3, 3);
		pane.add(resultLabel, 2, 5);
		pane.add(okButton, 2, 6);
		pane.add(rightSpaceLabel, 4, 0);
		Scene scene = new Scene(pane, WINDOW_WIDTH, WINDOW_HEIGHT);
		scene.getStylesheets().add("style.css");
		alertWindow.setScene(scene);
		alertWindow.showAndWait();

		return true;

	}

	private String backgroundPic(String cssResult) {
		if (cssResult.equalsIgnoreCase("Rock")) {
			return "rock";
		} else if (cssResult.equalsIgnoreCase("Scissors")) {
			return "scissors";
		} else if (cssResult.equalsIgnoreCase("paper")) {
			return "paper";
		} else if (cssResult.equalsIgnoreCase("lizard")) {
			return "lizard";
		} else {
			return "spock";
		}

	}

}
