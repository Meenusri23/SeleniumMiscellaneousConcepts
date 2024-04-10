package fileReadingOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class usingBufferedReader {

	public static void main(String[] args) throws IOException {


		String Location = "BufferedWriter.txt";
		
		FileReader fileReader = new FileReader(Location);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String result = bufferedReader.readLine();
		
		while((result = bufferedReader.readLine())!=null) {
		System.out.println(result);
		}
		
		
		

	}

}
