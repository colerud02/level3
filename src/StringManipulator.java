import java.util.Stack;

public class StringManipulator {

	public String reversword(String given) {
		String final1 = "";
		Stack<Character> revword = new Stack<Character>();

		for (int i = 0; i < given.length(); i++) {
			revword.push(given.charAt(i));

		}
		for (int i = 0; i < given.length(); i++) {
			final1 += revword.pop();
		}
		System.out.println(final1);
		return final1;
	}

	public String capitalizeword(String given) {
		String final1="";
		final1+=given.toUpperCase();
		System.out.println(final1);
		return final1;
	}

}
