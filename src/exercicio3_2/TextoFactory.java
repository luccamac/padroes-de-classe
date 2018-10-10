package exercicio3_2;

public class TextoFactory {
	
	public Texto criaTexto(TipoTexto tipo) {
		switch (tipo) {
		case CONFIDENCIAL:
			return new TextoConfidencial();
		case PUBLICO:
			return new TextoPublico();
		default:
			return null;
		}
	}

}
