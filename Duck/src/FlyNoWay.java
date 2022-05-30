/*Some ducks cannot fly.  Just another concrete class to represent a different FlyBehavior*/
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
