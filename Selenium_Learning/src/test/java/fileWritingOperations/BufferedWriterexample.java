package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location = "BufferedWriter.txt";
		String Content = "Java is a beautiful language";
		
		//Writing a file using FileWriter is a costly operation and performance will be very low hence using bufferedWriter
		FileWriter fileWriter = new FileWriter(Location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(Content);
		
		bufferedWriter.close();
		
		
		

	}

}
