package exercicio3_2;

public class TextoFactory {
	
	public Texto criaTexto(String senha) {
		if (senha.equals("designpatterns")) {
			return new TextoConfidencial();
		} 
		else return new TextoPublico();
	}

}
