package exercicio3_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NomesTests {
	
	private static String nomeRecebido1;
	private static String nomeRecebido2;
	private static NomesFactory factory1;
	private static NomesFactory factory2;

	@BeforeAll
	static void setUp() {
		nomeRecebido1 = "McNealy, Scott";
		nomeRecebido2 = "Scott McNealy";
		factory1 = new NomesFactory(nomeRecebido1);
		factory2 = new NomesFactory(nomeRecebido2);
	}
	
	@Test
	void testeNomeCompletoSeparado() {
		assertEquals("Scott McNealy", factory1.escolheTipoNome());
	}
	
	@Test
	void testeNomeCompletoJunto() {
		assertEquals("Scott McNealy", factory2.escolheTipoNome());
	}

}
