package exercicio3_2;

public class TextoConfidencial implements Texto {
	
	private String conteudo;
	
	public TextoConfidencial() {
		conteudo = "Estas s�o informa��es confidenciais, o que significa que voc� provavelmente sabe a palavra secreta!";
	}

	@Override
	public String getConteudo() {
		return conteudo;
	}

}
