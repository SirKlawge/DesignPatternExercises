/*There are different kinds of pizza stores: California, Chicago, and NY.
 * They each make their own style of pizza.
 * */
public class Main {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		
		pizza = chicagoPizzaStore.orderPizza("cheese");

	}

}
