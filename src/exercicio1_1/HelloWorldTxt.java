package exercicio1_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldTxt extends HelloWorld {

	@Override
	public boolean getGreeting() {
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try {
			file = new File("./HelloWorld.txt");
			fileWriter = new FileWriter(file);
			// create file if not exists
			if (!file.exists()) {
				file.createNewFile();
			}
			// initialize BufferedWriter
			writer = new BufferedWriter(fileWriter);

			//write integers
			writer.write("Hello, World!");
			System.out.println("File written successfully.");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
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


