/*Condiments decorate beverages, so it takes has a Beverage as a field.
 */
public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	
	public abstract String getDescription();
}
