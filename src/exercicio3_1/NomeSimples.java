package exercicio3_1;

public class NomeSimples {
	
	public String processaNome (String nomeRecebido) {
		int indexSeparacao = 0;
		String nome = " ";
		String sobrenome = " ";
		
		for (int i = 0; i < nomeRecebido.length(); i++) {
			if (nomeRecebido.charAt(i) == ' ') {
				indexSeparacao = i;
			}
		}
		
		nome = nome.replaceAll("\\s","");
		sobrenome = sobrenome.replaceAll("\\s","");
		
		nome = nomeRecebido.substring(0, indexSeparacao);
		sobrenome = nomeRecebido.substring(indexSeparacao+1, nomeRecebido.length());
		
		Nome objNome = new Nome(nome, sobrenome);
		return objNome.toString();
		
	}
		
}

