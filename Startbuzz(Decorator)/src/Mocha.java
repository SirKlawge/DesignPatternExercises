
public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super.beverage = beverage;
	}

	public float cost() {
		return 0.50f + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
