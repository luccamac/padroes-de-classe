package exercicio1_1;

public class HelloWorldPrint implements HelloWorld {

	public boolean getGreeting() {
		try {
			System.out.println("Hello, World!");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
