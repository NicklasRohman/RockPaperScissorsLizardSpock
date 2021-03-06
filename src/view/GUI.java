package view;

import java.util.ArrayList;
import java.util.List;

import controller.DataBas;
import controller.GamePlay;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.Human;

public class GUI extends Application {
	GamePlay gamePlay = GamePlay.getInstance();

	final int WINDOW_WIDTH = 1600;
	final int WINDOW_HEIGHT = 900;

	Button simpleAi;
	Button middleAi;
	Button smartAi;
	
	Button rock;
	Button paper;
	Button scissors;
	Button lizard;
	Button spock;
	Button help;
	List<Button> buttons;

	Stage window;
	static Label playerName;
	static Label playerWin;
	static Label playerTotalMatches;

	private List<ButtonPressedListener> buttonPressedListeners = new ArrayList<>();
	
	public void addButtonPressedListener(ButtonPressedListener buttonPressedListener) {
		buttonPressedListeners.add(buttonPressedListener);

	}

	/**
	 * Starts the GUI
	 * 
	 * @param args
	 *            = null
	 */
	public void startGui(String[] args) {
		launch(new String[] {});
	}

	/**
	 * adds all the buttons in list
	 * @return list of buttons
	 */ 
	public List<Button> getButtons() {
		buttons.add(rock);
		buttons.add(paper);
		buttons.add(scissors);
		buttons.add(lizard);
		buttons.add(spock);
		buttons.add(help);
		buttons.add(simpleAi);
		buttons.add(middleAi);
		buttons.add(smartAi);
		
		return buttons;
	}

	/**
	 * 
	 * @param index
	 */
	public void pressButton(int index) {

		for (ButtonPressedListener listener : buttonPressedListeners) {
			listener.buttonPressed(new ButtonPressedEvent(index));
		}
	}

	/**
	 * Show the GUI
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			window = primaryStage;
			window.setOnCloseRequest(e -> {
				e.consume();

				ConfirmBox confirmBox = ConfirmBox.getInstance();
				Boolean answer = confirmBox.display("Are You Sure???");
				if (answer) {
					DataBas databas = DataBas.getInstance();
					databas.savePlayer();
					window.close();
				}

			});

			addButtonPressedListener(gamePlay);
			rock = new Button();
			paper = new Button();
			scissors = new Button();
			lizard = new Button();
			spock = new Button();
			help = new Button("Help");
			
			simpleAi = new Button("Easy Ai");
			middleAi = new Button("Normal Ai");
			smartAi = new Button("Hard Ai");
			
			playerName = new Label();
			playerWin = new Label();
			playerTotalMatches = new Label("Total");

			playerName.getStyleClass().add("playerLabels");
			playerWin.getStyleClass().add("playerLabels");
			playerTotalMatches.getStyleClass().add("playerLabels");

			GridPane pane = new GridPane();
			pane.getStyleClass().add("pane");
			pane.setAlignment(Pos.CENTER);
			pane.setHgap(10);
			pane.setVgap(10);
			//pane.setGridLinesVisible(true);
			pane.setMinSize(WINDOW_WIDTH, WINDOW_HEIGHT);

			// grid system (column, row)
			pane.add(rock, 1, 1);
			pane.add(paper, 3, 1);
			pane.add(scissors, 5, 1);
			pane.add(lizard, 2, 3);
			pane.add(spock, 4, 3);
			pane.add(playerName, 1, 6);
			pane.add(playerWin, 2, 6);
			pane.add(playerTotalMatches, 3, 6);
			pane.add(help, 6, 7);
			pane.add(simpleAi, 1, 7);
			pane.add(middleAi, 2, 7);
			pane.add(smartAi, 3, 7);
			
			rock.getStyleClass().addAll("buttonClass", "buttonSize", "rock");
			rock.setOnAction(e -> pressButton(0));

			paper.getStyleClass().addAll("buttonClass", "buttonSize", "paper");
			paper.setOnAction(e -> pressButton(1));

			scissors.getStyleClass().addAll("buttonClass", "buttonSize", "scissors");
			scissors.setOnAction(e -> pressButton(2));

			lizard.getStyleClass().addAll("buttonClass", "buttonSize", "lizard");
			lizard.setOnAction(e -> pressButton(3));

			spock.getStyleClass().addAll("buttonClass", "buttonSize", "spock");
			spock.setOnAction(e -> pressButton(4));

			help.getStyleClass().addAll("buttonClass", "mainButton");
			help.setOnAction(e -> pressButton(5));

			simpleAi.getStyleClass().addAll("aiButtonClass", "aiButtonSize");
			simpleAi.setOnAction(e -> pressButton(6));
			
			middleAi.getStyleClass().addAll("aiButtonClass", "aiButtonSize");
			middleAi.setOnAction(e -> pressButton(7));
			
			smartAi.getStyleClass().addAll("aiButtonClass", "aiButtonSize");
			smartAi.setOnAction(e -> pressButton(8));
			
			Scene scene = new Scene(pane, WINDOW_WIDTH, WINDOW_HEIGHT);
			scene.getStylesheets().add("style.css");
			window.setScene(scene);
			window.show();

			gamePlay.startGame();
			labelText();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Sets the text on label playerName , playerWin and playerTotalMatches.
	 */
	public void labelText() {
		Human human = Human.getInstance();
		playerName.setText("Player: " + human.getName());
		playerWin.setText("Wins over Ai: " + human.getWin());
		playerTotalMatches.setText("Total matches: " + (human.getWin() + human.getLose() + human.getDraw()));
	}

}