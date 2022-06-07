
public class Espresso extends Beverage {
	
	public Espresso(Size size) {
		super.description = "Espresso";
		this.setSize(size);
	}

	@Override
	public float cost() {
		return 1.99f;
	}

}
