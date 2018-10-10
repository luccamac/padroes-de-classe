package exercicio1_2;

import org.joda.time.*;
public class PizzaFactory {
	
	public PizzaFactory() {
		
	}
	
	public Pizza getPizza (DateTime dataPedido) {
		switch (dataPedido.getDayOfWeek()) {
		case 1:
		case 3:
		case 5:
			return new PizzaCalabresa();
		case 2:
		case 4:
		case 6:
			return new PizzaPresunto();	
		case 7:
			System.out.println("Pizzaria fechada!");
			return null;
		default:
			return null;
		}
	}
		
}
