package exercicio4_1;

public class Singleton {
	
	private Incremental incremental;
	
	public Incremental getInstance() {
		if (incremental == null) {
			incremental = new Incremental();
			return incremental;
		} else {
			return incremental;
		}
	}
	
}
