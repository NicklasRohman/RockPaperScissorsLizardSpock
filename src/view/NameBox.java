package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Nicklas Its a singleton class Handles GUI for the popup window when
 *         player chooses a name
 */
public class NameBox {

	static NameBox nameBox;

	Stage alertWindow;

	private NameBox() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static NameBox getInstance() {
		if (nameBox == null) {
			nameBox = new NameBox();
		}
		return nameBox;
	}

	/**
	 * The method display popup window
	 * 
	 * @param message
	 *            What it should stand on the label
	 * 
	 * @return player name
	 */
	public String display(String message) {

		alertWindow = new Stage();

		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setHeight(300);
		alertWindow.setWidth(400);
		alertWindow.initStyle(StageStyle.UNDECORATED);

		Label label = new Label();
		label.setText(message);

		Button okButton = new Button("Ok");
		TextField nameInput = new TextField();
		nameInput.setMaxWidth(300);

		okButton.setOnAction(e -> {

			alertWindow.close();

		});

		VBox centerLayout = new VBox(10);
		centerLayout.getChildren().addAll(label, nameInput);
		centerLayout.setAlignment(Pos.CENTER);

		HBox bottomLayout = new HBox();
		bottomLayout.getChildren().addAll(okButton);
		bottomLayout.setAlignment(Pos.CENTER);
		bottomLayout.getStyleClass().add("bottomLayout");

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(centerLayout);
		borderPane.setBottom(bottomLayout);
		borderPane.getStyleClass().add("borderPane");

		Scene scen = new Scene(borderPane);
		scen.getStylesheets().add("style.css");
		alertWindow.setScene(scen);
		alertWindow.showAndWait(); 
	
		String result = nameInput.getText().toUpperCase()+"";
		
		return result;
	}
}
