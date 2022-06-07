
public class Decaf extends Beverage {
	
	public Decaf(Size size) {
		super.description = "Decaf";
		this.setSize(size);
	}

	@Override
	public float cost() {
		return 1.05f;
	}

}
