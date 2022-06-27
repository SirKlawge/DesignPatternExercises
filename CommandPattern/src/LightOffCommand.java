
public class LightOffCommand implements Command {
	
	private Receiver light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		((Light)this.light).off();
	}
	
	public String toString() {
		return "Turn light off";
	}

	public Receiver getReceiver() {
		return this.light;
	}

	@Override
	public void undo() {
		((Light) this.light).on();
	}

}
