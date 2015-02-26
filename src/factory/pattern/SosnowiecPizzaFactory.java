package factory.pattern;

public class SosnowiecPizzaFactory extends PizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new SosnowiecCheesePizza();
		}
		else if (type.equals("Pepperoni")) {
			pizza = new SosnowiecPepperoniPizza();
		}
		else if (type.equals("Margarita")) {
			pizza = new SosnowiecMargaritaPizza();
		}
		return pizza;
	}
	
}
