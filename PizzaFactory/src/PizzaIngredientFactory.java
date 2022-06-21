/*Notice that there's a class for each kind of ingredient.
 * 
 * Each region, NY, Chicago, and California, are all going to have their own PizzaIngredientFactory.
 * 
 * Then we gotta make a bunch of concrete classes for each ingredient.  There are likely going to be 
 * abstract versions of each kind of ingredient that the concrete variants inherit.
 * 
 * */
public interface PizzaIngredientFactory {
	
	public Dough createDough();
	
	public Sauce createSauce();
	
	public Cheese createCheese();
	
	public Veggie[] createVeggies();
	
	public Pepperoni createPepperoni();
	
	public Clam createClam();
}
