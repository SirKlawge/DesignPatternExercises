/*Some ducks are able to fly with their wings.  This is a concrete class that will be 
 * declared by the client by its interface, FlyBehavior.*/
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
		
	}

}
