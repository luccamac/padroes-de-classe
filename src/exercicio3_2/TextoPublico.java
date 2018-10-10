package exercicio3_2;

public class TextoPublico implements Texto {
	
	private String conteudo;
	
	public TextoPublico() {
		conteudo = "Estas são informações públicas sobre qualquer coisa. Todo mundo pode ver este arquivo.";
	}

	@Override
	public String getConteudo() {
		return conteudo;
	}

}