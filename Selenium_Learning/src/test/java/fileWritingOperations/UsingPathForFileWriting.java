package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathForFileWriting {

	public static void main(String[] args) throws IOException {


		String Location = "Usingpath.txt";
		String Content = "File is written using Path operation using Java program";
		
		Path path = Paths.get(Location);
		
		Files.write(path, Content.getBytes());
	  

	}

}
