package exercicio3_3;

import java.util.ArrayList;

public class ConsoleLog implements Log {
	
	private ArrayList<Integer> numeros;
	
	public ConsoleLog() {
		numeros = new ArrayList<Integer>();
	}

	@Override
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	@Override
	public void processaNumeros() {
		for (int i=0; i<=10; i++) {
			numeros.add(i);
			System.out.println(i);
		}
	}
	
	public void printaNumeros() {
		for (Integer i: numeros) {
			System.out.println(i);
		}
	}
	
	

}
