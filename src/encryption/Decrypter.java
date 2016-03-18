package encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Decrypter {
	
	public static HashMap<Character, Character> mapping = new HashMap<Character, Character>();

	public String decode(String encodedText) {
		//update this to decode the message!
		return null;
	}
	
	public static HashMap<Character, Character> readMappingFile() throws IOException {
		FileReader input = new FileReader("encryptionMap.txt");
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;

		while ( (myLine = bufRead.readLine()) != null)
		{    
		    String[] array = myLine.split(":");
		    mapping.put(array[0].charAt(0), array[1].charAt(0));		    
		}
		
		return mapping;
	}
}
