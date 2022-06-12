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
			System.out.println(" " + topping);
		}
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
		
	}

	public void cut() {
		System.out.println("Cutting the pieces into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza into official PizzaStore box");
	}
	
	public String getName() {
		return this.name;
	}

}
