/*Different ducks have different flying behaviors.  Each concrete behavior of flying will 
 * implement this interface and thus will be of this type.
 * 
 * You can add a new type of flying behavior by making a new concrete class that 
 * implements this interface.*/
public interface FlyBehavior {
	public void fly();
}
