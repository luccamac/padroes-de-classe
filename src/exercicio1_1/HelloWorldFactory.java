package exercicio1_1;

public class HelloWorldFactory {
	
	public HelloWorldFactory() {
		
	}
	
	public HelloWorld getHelloWorld (HelloWorldType type) {
		
		if (type.equals(HelloWorldType.PRINT)){
			return new HelloWorldPrint(); 
		} 
		else { 
			return new HelloWorldTxt();
		}
	}
}
