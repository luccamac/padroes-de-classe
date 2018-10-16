package exercicio3_1;

public class NomesFactory {
	
	private String nomeRecebido;
	
	public String escolheTipoNome() {
		if (nomeRecebido.contains(",")) {
//			escolhe nomeExtenso
			NomeExtenso extenso = new NomeExtenso();
			return extenso.processaNome(nomeRecebido);
		} 
//			escolhe nomeSimples
			NomeSimples simples = new NomeSimples();
			return simples.processaNome(nomeRecebido);
	}

	public NomesFactory(String nomeRecebido) {
		this.nomeRecebido = nomeRecebido;
	}

}
