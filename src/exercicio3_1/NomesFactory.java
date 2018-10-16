package exercicio3_1;

public class NomesFactory {
	
	private String nomeRecebido;
	
	public void escolheTipoNome() {
		if (nomeRecebido.contains(",")) {
//			escolhe nomeExtenso
			NomeExtenso extenso = new NomeExtenso();
			extenso.processaNome(nomeRecebido);
		} 
//			escolhe nomeSimples
			NomeSimples simples = new NomeSimples();
			simples.processaNome(nomeRecebido);
	}

	public NomesFactory(String nomeRecebido) {
		this.nomeRecebido = nomeRecebido;
	}

}
