package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Nicklas Its a singleton class Handles GUI for the popup window when
 *         player what help
 */
public class HelpBox {

	static HelpBox helpBox;

	private HelpBox() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static HelpBox getInstance() {
		if (helpBox == null) {
			helpBox = new HelpBox();
		}
		return helpBox;
	}

	/**
	 * The method display popup window
	 * 
	 * @param message
	 *            What it should stand on the label
	 * @return boolean answer
	 */
	public boolean display() {
		Stage alertWindow = new Stage();

		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(1100);
		alertWindow.setHeight(1000);
		alertWindow.initStyle(StageStyle.UNDECORATED);

		Label label = new Label();
		label.getStyleClass().add("helpLabel");

		Button yesButton = new Button("OK");

		yesButton.setOnAction(e -> {
			alertWindow.close();

		});

		VBox centerLayout = new VBox(10);
		centerLayout.getChildren().addAll(label);
		centerLayout.setAlignment(Pos.CENTER);

		HBox bottomLayout = new HBox();
		bottomLayout.getChildren().addAll(yesButton);
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

		return true;

	}
}
