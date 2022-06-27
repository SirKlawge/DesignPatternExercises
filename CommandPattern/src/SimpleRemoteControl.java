/*This SimpleRemoteControl simulates a controller with a single button.*/
public class SimpleRemoteControl {
	
	private Command slot;
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		this.slot.execute();
	}

}
