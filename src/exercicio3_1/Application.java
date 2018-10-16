package exercicio3_1;

public class Application {

	public static void main(String[] args) {
		
//		nome com vírgula
		NomesFactory factory = new NomesFactory("Ricardo,Machado");
		factory.escolheTipoNome();
		
//		nome sem vírgula
		NomesFactory factory2 = new NomesFactory("Ricardo Machado");
		factory2.escolheTipoNome();
	}

}
