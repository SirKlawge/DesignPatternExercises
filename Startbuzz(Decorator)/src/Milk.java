
public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public float cost() {
		return 0.25f + beverage.cost();
	}

	/*Notice that the call to the beverage's description is performed first.  This, like recursion, 
	 * will get descriptions all the way down until it gets*/
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Milk";
	}

}
