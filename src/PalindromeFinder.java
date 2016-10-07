import java.io.File;
import java.io.FileReader;

import javax.naming.PartialResultException;

public class PalindromeFinder {
	char letter;
	String word = "";
	int num1 = 0;

	public static void main(String[] args) {
		PalindromeFinder pf = new PalindromeFinder();
	}

	public PalindromeFinder() {

		try {
			FileReader fr = new FileReader(new File("words.txt"));
			int c = 0;
			while ((c = fr.read()) != -1) {
				letter = (char) c;
				// System.out.print(letter);
				if (letter != '\n') {
					word += letter;

					// System.out.println(word);

				} 
				else{
					isPalindrome(word);
					word = "";
					num1++;
				}

			}
		} catch (Exception e) {
			System.out.println("Error loading file!");
		}

	}

	boolean isPalindrome(String word1) {
		for (int i = 0; i < word.length(); i++) {
			char first = word.charAt(i);
			char last = word.charAt(word.length() - i - 1);
			if (first != last) {
				// System.out.println(word);
				return false;
			}
		}
		System.out.println(word+" is a palindrome!");
		return true;

	}
}
