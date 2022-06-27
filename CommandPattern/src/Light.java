/*This is a class defining a light.  Lights are meant to be turned on and off.
 * This will be used by a LightCommand object.*/
public class Light extends Receiver {
	
	private String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(this.name+ " is on");
	}
	
	public void off() {
		System.out.println(this.name + " is off");
	}
	
	public String toString() {
		return this.name;
	}
}
