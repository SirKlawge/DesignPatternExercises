
public abstract class Beverage {
	public enum Size{TALL, GRANDE, VENTI};
	
	private Size size;
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract float cost();
	
	public void setSize(Size size) {
		this.size = size;
	}
}
