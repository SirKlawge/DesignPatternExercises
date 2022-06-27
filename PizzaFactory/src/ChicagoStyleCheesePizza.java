
public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra thick crust dough";
		this.sauce = "Plum tomato sauce";
		
		this.toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
