package factory.pattern;

public class RadomPizzaFactory extends PizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new RadomCheesePizza();
		}
		else if (type.equals("Pepperoni")) {
			pizza = new RadomPepperoniPizza();
		}
		else if (type.equals("Margarita")) {
			pizza = new RadomMargaritaPizza();
		}
		return pizza;
	}

}
