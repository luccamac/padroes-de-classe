package exercicio1_2;

public class PizzaCalabresa extends Pizza {
	
	private String ingredientes;
	
	public PizzaCalabresa() {
		ingredientes = "CALABRESA :: queijo + calabresa + tomate";
	}
	
	
	@Override
	public String getIngredientes() {
		return ingredientes;
	}

}
