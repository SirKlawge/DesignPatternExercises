
/*There are four ConcreteComponents, one for each coffee type: HouseBlend, DarkRoast, 
 * Espresso, and Decaf.  We are gonna decorate these with condiments: Milk, Mocha, Soy, Whip.*/
public class Startbuzz {

	public static void main(String[] args) {
		//Make a beverage
		Beverage darkRoast = new DarkRoast(Beverage.Size.GRANDE);
		
		//Add some milk
		CondimentDecorator milk = new Milk(darkRoast);
		System.out.println(milk.cost());
		
		CondimentDecorator mocha = new Mocha(milk);
		System.out.println(mocha.cost());
	}

}
