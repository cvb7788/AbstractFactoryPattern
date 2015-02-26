package factory.pattern;

public abstract class PizzaFactory {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}
