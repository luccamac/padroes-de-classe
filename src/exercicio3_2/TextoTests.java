package exercicio3_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextoTests {
	
	private TextoFactory factory;
	
	@BeforeEach
	void setUp() {
		factory = new TextoFactory();
	}

	@Test
	void testTextoConfidencialConteudo() {
		String conteudoConfidencial = "Estas s�o informa��es confidenciais, o que significa que voc� provavelmente sabe a palavra secreta!";
		Texto text = factory.criaTexto("designpatterns");
		assertEquals(conteudoConfidencial, text.getConteudo());
	}
	
	@Test
	void testTextoPublicoConteudo() {
		String conteudoPublico = "Estas s�o informa��es p�blicas sobre qualquer coisa. Todo mundo pode ver este arquivo.";
		Texto text = factory.criaTexto("");
		assertEquals(conteudoPublico, text.getConteudo());
	}

}
