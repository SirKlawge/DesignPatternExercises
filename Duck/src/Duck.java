/*Here, you should only provide implementation or fields for the qualities that all subclasses
 * have in common.
 * 
 * Notice that different subclasses fly and quack differently, so these behaviors have been 
 * delegated to flyBehavior and quackBehavior classes respectively*/
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	/*The setter methods for the behaviors allow us to change behaviors on the fly, 
	 * or at runtime.*/
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
