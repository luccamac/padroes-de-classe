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
		String conteudoConfidencial = "Estas são informações confidenciais, o que significa que você provavelmente sabe a palavra secreta!";
		Texto text = factory.criaTexto(TipoTexto.CONFIDENCIAL);
		assertEquals(conteudoConfidencial, text.getConteudo());
	}
	
	@Test
	void testTextoPublicoConteudo() {
		String conteudoPublico = "Estas são informações públicas sobre qualquer coisa. Todo mundo pode ver este arquivo.";
		Texto text = factory.criaTexto(TipoTexto.PUBLICO);
		assertEquals(conteudoPublico, text.getConteudo());
	}

}
