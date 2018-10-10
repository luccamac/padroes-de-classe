package exercicio1_2;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaTests {
	
	private PizzaFactory factory;
	private DateTime data;

	@BeforeEach
	void setUp() throws Exception {
		factory = new PizzaFactory();
	}
	
	@Test
	void testPizzaNaQuartaFeira() {
		data = new DateTime("2018-10-10");
		System.out.println("dia " + data.getDayOfMonth());
		System.out.println("mês " + data.getMonthOfYear());
		System.out.println("ano " + data.getYear());
		Pizza pizza = factory.getPizza(data);
		assertEquals("CALABRESA :: queijo + calabresa + tomate",
				pizza.getIngredientes());			
	}
	
	@Test
	void testPizzaNaQuintaFeira() {
		data = new DateTime("2018-10-11");
		System.out.println("dia " + data.getDayOfMonth());
		System.out.println("mês " + data.getMonthOfYear());
		System.out.println("ano " + data.getYear());
		Pizza pizza = factory.getPizza(data);
		assertEquals("PRESUNTO :: queijo + presunto + tomate",
				pizza.getIngredientes());			
	}
	
	@Test
	void testRestauranteFechado() {
		data = new DateTime("2018-10-14");
		System.out.println("dia " + data.getDayOfMonth());
		System.out.println("mês " + data.getMonthOfYear());
		System.out.println("ano " + data.getYear());
		Pizza pizza = factory.getPizza(data);
		assertNull(pizza);			
	}

}
