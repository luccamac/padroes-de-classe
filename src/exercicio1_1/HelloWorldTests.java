package exercicio1_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTests {
	
	private HelloWorldFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new HelloWorldFactory();
	}
	
	@Test
	void testHelloPrint() {
		HelloWorld hello = factory.getHelloWorld(HelloWorldType.PRINT);
		assertTrue(hello.getGreeting());
	}

	@Test
	void testHelloTxt() {
		HelloWorld hello = factory.getHelloWorld(HelloWorldType.TXT);
		assertTrue(hello.getGreeting());
	}

}
