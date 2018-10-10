package exercicio1_2;

import java.util.Calendar;

public class Application {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.getPizza(cal);
		System.out.println(pizza.getIngredientes());
		
	}

}