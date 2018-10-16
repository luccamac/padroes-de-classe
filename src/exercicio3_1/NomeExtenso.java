package exercicio3_1;

public class NomeExtenso {
	
	public String processaNome(String nomeExtenso) {
		nomeExtenso = nomeExtenso.replaceAll("\\s",""); // remove espaços em branco
		String nome = "";
		String sobrenome = "";
		int indexSobrenome = 0;

		for (int i = 0; i < nomeExtenso.length(); i++) {
			if (nomeExtenso.charAt(i) == ',') {
				indexSobrenome = i;
			}
		}

		sobrenome = nomeExtenso.substring(0, indexSobrenome);
		nome = nomeExtenso.substring(indexSobrenome+1, nomeExtenso.length());
		
		Nome objNome = new Nome(nome, sobrenome);
		return objNome.toString();
	}
	
	public NomeExtenso() { }

}
