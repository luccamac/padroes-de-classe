package exercicio3_2;

public class TextoPublico implements Texto {
	
	private String conteudo;
	
	public TextoPublico() {
		conteudo = "Estas s�o informa��es p�blicas sobre qualquer coisa. Todo mundo pode ver este arquivo.";
	}

	@Override
	public String getConteudo() {
		return conteudo;
	}

}