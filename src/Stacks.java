import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		System.out.println(new Stacks().reverseWord("Hello"));
	}

	public String reverseWord(String word1) {
		Stack<Character> word = new Stack<Character>();
		for (int i = 0; i < word1.length(); i++) {
			word.push(word1.charAt(i));

		}
		String reversedWord = "";
		for (int i = 0; i < word1.length(); i++) {
			Character letter = word.pop();

			reversedWord += letter;
		}

		return reversedWord;

	}

}
