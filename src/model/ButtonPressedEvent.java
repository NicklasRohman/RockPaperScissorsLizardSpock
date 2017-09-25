package model;
/**
 * 
 * @author Nicklas
 * this class should only get what button that was pressed
 */
public class ButtonPressedEvent {

	private int index;

	public ButtonPressedEvent(int index) {
		this.index = index;
	}

	public int getPressedButton() {
		return index;
	}
}
