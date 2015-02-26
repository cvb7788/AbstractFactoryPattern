package factory.pattern;

public class App {
	public static void main(String[] args) {
		PizzaFactory pizzaFactorySosnowiec = new SosnowiecPizzaFactory();
		PizzaFactory pizzaFactoryRadom = new RadomPizzaFactory();
		pizzaFactoryRadom.createPizza("Cheese");
		pizzaFactorySosnowiec.createPizza("Pepperoni");
	}
}
