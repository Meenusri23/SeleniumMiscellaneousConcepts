package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		String Location = "UsingFOS.txt";
		String Content = "File is written using File output stream operation using Java program";
		
		FileOutputStream fileOutputStream = new FileOutputStream(Location);
		
		 byte[] WriteContent = Content.getBytes();
		
		 fileOutputStream.write(WriteContent);
		 
		 fileOutputStream.close();
	}

}
