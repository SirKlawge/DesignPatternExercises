/*There are different kinds of pizza stores: California, Chicago, and NY.
 * They each make their own style of pizza.
 * */
public class Main {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		System.out.println(nyPizzaStore.orderPizza("cheese"));
		
		System.out.println(chicagoPizzaStore.orderPizza("veggie"));

	}

}
