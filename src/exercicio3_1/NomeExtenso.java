package exercicio3_1;

public class NomeExtenso {
	
	public void processaNome(String nomeExtenso) {
		nomeExtenso = nomeExtenso.replaceAll("\\s",""); // remove espaços em branco
		String nome = "";
		String sobrenome = "";
		int indexSobrenome = 0;

		for (int i = 0; i < nomeExtenso.length(); i++) {
			if (nomeExtenso.charAt(i) == ',') {
				indexSobrenome = i;
			}
		}

		nome = nomeExtenso.substring(0, indexSobrenome);
		sobrenome = nomeExtenso.substring(indexSobrenome+1, nomeExtenso.length());
		
		Nome objNome = new Nome(nome, sobrenome);
		System.out.println(objNome);
	}
	
	public NomeExtenso() { }

}
