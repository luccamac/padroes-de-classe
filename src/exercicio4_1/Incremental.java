package exercicio4_1;

public class Incremental {
    
    private static final Incremental instance = new Incremental();
    
    private static int count = 0;
    private int numero;
    
    @Override
	public String toString() {
		return "Incremental [numero=" + numero + "]";
	}

	private Incremental(){
    	numero = ++count;
    }

    public static Incremental getInstance(){
        return instance;
    }
    
    public static void main(String[] args) {
    		for (int i = 0; i < 10; i++) {
    			Incremental inc = new Incremental();
    			System.out.println(inc);
    		}
    }
}