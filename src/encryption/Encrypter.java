package encryption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Encrypter {
	
	public static ArrayList<Character> alphabet = new ArrayList<Character>();
	public static ArrayList<Character> availableChar = new ArrayList<Character>();
	public static HashMap<Character, Character> mapping = new HashMap<Character, Character>();
	private static Random random = new Random();
	
	public Encrypter() {
		populateAlphabet(alphabet);
		populateAlphabet(availableChar);
	}
	
	public String encrypt(String clearText) {
		String e = "";
		for (char character : clearText.toCharArray()) {
			if (character < 97 || character > 122)
				e+= character;
			else
				e+=mapping.get(character);
				
		}
		return e;
	}

	public static void populateAlphabet(ArrayList<Character> a) {
		for (int i = 97; i < 123; i++) {
			a.add((char) i);
		}
	}
	
	public static Character pickAnyOfTheRemainingChars() {
		//return a random remaining character;
		int x = random.nextInt(availableChar.size());
		char b = availableChar.get(x);
		availableChar.remove(x);
		return b;
	}
	
	public static void createMappingFile() throws IOException {
		FileWriter fw = new FileWriter("encryptionMap.txt");
	 
		for (Character c : alphabet) {
			char k = pickAnyOfTheRemainingChars();
			mapping.put(c, k);
			fw.write(c+":"+ k); //update that
			fw.write('\n');
		}
	 
		fw.close();
	}
}
