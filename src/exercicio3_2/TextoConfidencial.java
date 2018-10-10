package exercicio3_2;

public class TextoConfidencial implements Texto {
	
	private String conteudo;
	
	public TextoConfidencial() {
		conteudo = "Estas são informações confidenciais, o que significa que você provavelmente sabe a palavra secreta!";
	}

	@Override
	public String getConteudo() {
		return conteudo;
	}

}
