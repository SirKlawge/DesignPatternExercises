
public class Fan extends Receiver {
	public String name;
	
	public Fan(String name) {
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
