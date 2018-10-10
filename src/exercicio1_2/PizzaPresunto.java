package exercicio1_2;

public class PizzaPresunto extends Pizza {
	
	private String ingredientes;
	
	public PizzaPresunto() {
		ingredientes = "PRESUNTO :: queijo + presunto + tomate";
	}
	
	
	@Override
	public String getIngredientes() {
		return ingredientes;
	}

}