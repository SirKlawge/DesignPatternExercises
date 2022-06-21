
public class ChicagoIngredientsFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie[] veggies = {new Eggplant(), new Spinach(), new BlackOlives()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}

}
