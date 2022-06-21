
public class CheesePizza extends Pizza {
	
	/*Now a factory provides the ingredients.
	 * 
	 * Remember, we have multiple concrete ingredient factories, NY, Chicago, etc..  So the specific 
	 * ingredients that an instance of a CheesePizza uses */
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.name);
		//Each time you need an ingredient, you ask the factory to produce it.
		this.dough = ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
	}

}
