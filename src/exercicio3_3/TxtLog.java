package exercicio3_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TxtLog implements Log {
	
	private ArrayList<Integer> numeros;
	
	public TxtLog() {
		numeros = new ArrayList<Integer>();
	}

	@Override
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	@Override
	public void processaNumeros() {
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try {
			file = new File("./Log.txt");
			fileWriter = new FileWriter(file);
			// create file if not exists
			if (!file.exists()) {
				file.createNewFile();
			}
			// initialize BufferedWriter
			writer = new BufferedWriter(fileWriter);
			for (int i=0; i<=10; i++) {
				String msg = String.format("%d", i);
				writer.write(msg);
			}
			System.out.println("File written successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close BufferedWriter
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// close FileWriter
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}
}

