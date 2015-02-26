package factory.pattern;

public abstract class Pizza {
	
	private String type = "None";
	
	public String getType() {
		return this.type;
	}
	public void prepare() {
		System.out.println("Preparing the pizza");
	}
	public void bake() {
		System.out.println("Baking the pizza");
	}
	public void cut() {
		System.out.println("Cutting the pizza");
	}
	public void box() {
		System.out.println("Boxing");
	}
	
}
