package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location ="UsingFileWriter.txt";
		String Content = "Learning Java and Using it is very simple!";
		
		FileWriter fileWriter = new FileWriter(Location);
		
		fileWriter.write(Content);
		
		fileWriter.close();

	}
}
