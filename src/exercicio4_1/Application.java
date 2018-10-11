package exercicio4_1;

public class Application {

	public static void main(String[] args) {
		Singleton sing = new Singleton();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(sing.getInstance().toString());
		}
	}

}
