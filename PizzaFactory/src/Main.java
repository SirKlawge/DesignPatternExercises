/*There are different kinds of pizza stores: California, Chicago, and NY.
 * They each make their own style of pizza.
 * 
 * This works by making concrete PizzaStore objects.  This client only needs to know the 
 * orderPizza() method, a method common to all kinds of PizzaStores.  
 * 
 * Since each different kind of concrete PizzaStore has its own way of creating pizzas, the 
 * createPizza() method in the abstract PizzaStore class is left abstract.  This createPizza() method 
 * is the factory method.  The concrete PizzaStores in this example only need to provide implementation 
 * for this factory method, and they do so by providing a series of if statements: one for each kind 
 * of pizza that PizzaStore makes.
 * 
 * The factory method returns a Pizza.  Each ConcreteProduct inherits Pizza, the AbstractProduct.
 * So if any of the PizzaStores wants to start making a new product, just add the new product to the 
 * concrete PizzaStore's if/else decision tree, and then make the ConcreteProduct.
 * 
 * What if there's a ConcreteProduct common to all PizzaStores?  No need to make one for each.  Just 
 * make a single concrete product, and add it to each PizzaStores' if/else decision tree.
 * 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyPizzaStore.createPizza("cheese");

	}

}
