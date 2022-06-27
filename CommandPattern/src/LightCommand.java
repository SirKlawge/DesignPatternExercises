/*This defines a command for a Light object.*/
public class LightCommand implements Command {
		
	private Light light;
	
	public LightCommand(Light light) {
		//This commands a particular light.  This light is the receiver of the request.
		this.light = light;
	}

	/*This particular LightCommand will call the on() method for the Light object*/
	@Override
	public void execute() {
		this.light.on();
	}
	
	public String toString() {
		return "Turn light on";
	}
	
	public Light getReceiver() {
		return this.light;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
