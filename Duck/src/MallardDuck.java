/*A concrete duck.  Recall that the Duck superclass provides two fields: a QuackBehavior and 
 * a FlyBehavior.  */
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior  = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard duck");
	}

}
