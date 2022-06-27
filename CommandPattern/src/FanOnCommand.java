
public class FanOnCommand implements Command {
	
	private Receiver fan;
	
	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		((Fan) this.fan).on();
	}

	public Receiver getReceiver() {
		return this.fan;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
