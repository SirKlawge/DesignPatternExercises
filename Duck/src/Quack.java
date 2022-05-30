/*Some ducks can quack.  This is a concrete class that provides one kind of QuackBehavior*/
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
