
public class HouseBlend extends Beverage {
	
	public HouseBlend(Size size) {
		super.description = "House blend";
		this.setSize(size);
	}

	@Override
	public float cost() {
		return 0.89f;
	}

}
