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
//		//Make a remote control
//		SimpleRemoteControl rc = new SimpleRemoteControl();
//		
//		//Make an object to control and the command object to control it
//		Light livingRoomLight = new Light();
//		Command livingRoomLightOn = new LightCommand(livingRoomLight);
//		
//		Command livingRoomLightOff = () -> {
//			livingRoomLight.off();
//		};
//		
//		rc.setCommand(livingRoomLightOff);
//		rc.buttonWasPressed();
//		
//		//Configure the remote with the new command.
//		rc.setCommand(livingRoomLightOn);
//		rc.buttonWasPressed(); //Press the button!
//		
//		//Make a garage door and a garage door command
//		GarageDoor gd = new GarageDoor();
//		Command gdCommand = new GarageDoorOpenCommand(gd);
//		
//		//Reconfigure the button to execute the garage door command.
//		rc.setCommand(gdCommand);
//		rc.buttonWasPressed(); //Push the button!
		
		RemoteControl rc = new RemoteControl();
		
		//Living room light
		Light livingRoomLight = new Light("Living Room Light");
		Command lrLightOn = new LightCommand(livingRoomLight);
		Command lrLightOff = new LightOffCommand(livingRoomLight);
		//Configure the top two buttons of the remote
		rc.setCommand(0, 0, lrLightOn);
		rc.setCommand(0, 1, lrLightOff);
		
		rc.buttonWasPushed(0, 0);
		rc.buttonWasPushed(0, 1);
		
		Light kitchenLight = new Light("Kitchen Light");
		Command kitLightOn = new LightCommand(kitchenLight);
		Command kitLightOff = new LightOffCommand(kitchenLight);
		
		rc.setCommand(1, 0, kitLightOn);
		rc.setCommand(1, 1, kitLightOff);
		
		rc.buttonWasPushed(1, 0);
		rc.buttonWasPushed(1, 1);
		
		Fan livingRoomCeilingFan = new Fan("Living Room Ceiling Fan");
		Command ceilingFanOn = new FanOnCommand(livingRoomCeilingFan);
		Command ceilingFanOff = new FanOffCommand(livingRoomCeilingFan);
		
		rc.setOnOffCommands(2, ceilingFanOn, ceilingFanOff);
		
		rc.buttonWasPushed(2, 0);
		rc.buttonWasPushed(2, 1);
	}

}
