
public class FanOffCommand implements Command {

	private Receiver fan;
	
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		((Fan) this.fan).off();
	}

	public Receiver getReceiver() {
		return this.fan;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
