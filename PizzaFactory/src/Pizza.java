import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	String name, dough, sauce;
	List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing one " + this.name + " pizza.");
		System.out.println("Tossing the " + this.dough + " dough.");
		System.out.println("Adding the " + this.sauce + " sauce.");
		System.out.println("Adding toppings...");
		for(String topping : this.toppings) {
			System.out.println();
		}
	}

	public void bake() {
		// TODO Auto-generated method stub
		
	}

	public void cut() {
		// TODO Auto-generated method stub
		
	}

	public void box() {
		// TODO Auto-generated method stub
		
	}

}
