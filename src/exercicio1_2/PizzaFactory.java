package exercicio1_2;

import java.util.Calendar;

public class PizzaFactory {
	
	public PizzaFactory() {
		
	}
	
	public Pizza getPizza (Calendar dataPedido) {
		switch (dataPedido.get(Calendar.DAY_OF_WEEK)) {
		case 2:
		case 4:
		case 6:
			return new PizzaCalabresa();
		case 3:
		case 5:
		case 7:
			return new PizzaPresunto();	
		case 1:
			System.out.println("Pizzaria fechada!");
			return null;
		default:
			return null;
		}
	}
		
}
