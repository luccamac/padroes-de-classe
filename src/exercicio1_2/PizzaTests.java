package exercicio1_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaTests {
	
	private PizzaFactory factory;
	private Calendar cal;

	@BeforeEach
	void setUp() throws Exception {
		factory = new PizzaFactory();
		cal = Calendar.getInstance();
	}
	
	@Test
	void testPizzaNaQuartaFeira() {
		cal.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(cal.toString());
		Pizza pizza = factory.getPizza(cal);
		assertEquals("CALABRESA :: queijo + calabresa + tomate",
				pizza.getIngredientes());
	}
	
//	@Test
//	void testPizzaNaQuintaFeira() {
//		Calendar.getInstance().set(;
//		Pizza pizza = factory.getPizza(cal);
//		assertEquals("PRESUNTO :: queijo + presunto + tomate",
//				pizza.getIngredientes());
//	}

}
