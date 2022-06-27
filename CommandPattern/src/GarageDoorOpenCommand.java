
public class GarageDoorOpenCommand implements Command {
	
	private Receiver garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		((GarageDoor) this.garageDoor).up();
	}

	
	public Receiver getReceiver() {
		return this.garageDoor;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
