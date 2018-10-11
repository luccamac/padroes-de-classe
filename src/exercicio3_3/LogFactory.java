package exercicio3_3;

public class LogFactory {
	
	public Log criaLog(String escolha) {
		if (escolha.equals("console")) {
			return new ConsoleLog();
		} 
		if (escolha.equals("arquivo")) {
			return new TxtLog();
		}
		return null;
	}

}
