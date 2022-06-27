/*Here, we're going to make a remote controller and configure its buttons with different commands.
 * All concrete commands implement the functional interface, Command.  
 * 
 * The single method that the Command interface guarantees is the execute command.
 * 
 * The Concrete Commands performs exactly one command, which it does in the implementation of its 
 * execute() method.
 * 
 * The ConcreteCommand performs its command on a particular object.  The ConcreteCommand holds a 
 * reference to this object as a field.
 * 
 * The object that the ConcreteCommand controls has a list of methods representing the different things
 * it can do.  A Light, for example, can turn on and off.  
 * */
public class RemoteControlTest {

	public static void main(String[] args) {
		//Make a remote control
		SimpleRemoteControl rc = new SimpleRemoteControl();
		
		//Make an object to control and the command object to control it
		Light livingRoomLight = new Light();
		Command livingRoomLightOn = new LightCommand(livingRoomLight);
		
		Command livingRoomLightOff = () -> {
			livingRoomLight.off();
		};
		
		rc.setCommand(livingRoomLightOff);
		rc.buttonWasPressed();
		
		//Configure the remote with the new command.
		rc.setCommand(livingRoomLightOn);
		rc.buttonWasPressed(); //Press the button!
		
		//Make a garage door and a garage door command
		GarageDoor gd = new GarageDoor();
		Command gdCommand = new GarageDoorOpenCommand(gd);
		
		//Reconfigure the button to execute the garage door command.
		rc.setCommand(gdCommand);
		rc.buttonWasPressed(); //Push the button!
	}

}
