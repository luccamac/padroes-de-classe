package exercicio3_3;

public class Application {

	public static void main(String[] args) {
		LogFactory factory = new LogFactory();
		Log log = factory.criaLog("arquivo");
		log.processaNumeros();
	}

}
