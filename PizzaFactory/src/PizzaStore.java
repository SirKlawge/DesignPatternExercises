public abstract class PizzaStore {
	
	public PizzaStore() {
		
	}
	
	/*For this example, each PizzaStore orders pizzas in the same way.
	 * It takes in a type pizza that specifies the concrete Pizza object that will be made.
	 * It then calls the createPizza() method thta will be given a concrete implementation by 
	 * the subclasses, since each type of PizzaStore makes its own kinds of pizzas.
	 * As of right now, each Subclass must have the same menu: cheese, pepperoni, veggie, and clam.
	 * This then calls Pizza's prepare, bake, cut, and box methods.  The assumption there is that 
	 * all pizza stores do these in the exact same way.
	 * 
	 * Note that when the client calls this, it has no idea what concrete Pizza is made; it only 
	 * knows that it's a Pizza, and therefore it will subsequently prepare, bake it, etc..*/
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/*This is the factory method. Since each pizza store makes pizzas in their own way, we let 
	 * the subclasses implement this.  It's okay for each subclass to have different options, since 
	 * they'll just return null if they don't offer a pizza of the provided type.*/
	public abstract Pizza createPizza(String type);
}
