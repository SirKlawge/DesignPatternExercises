
public abstract class Pizza {
	
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggie[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clam clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
		
	}

	public void cut() {
		System.out.println("Cutting the pieces into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza into official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name; //TODO: alter this later.
	}

}
