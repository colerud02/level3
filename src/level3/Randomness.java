package level3;

import java.util.Random;

public class Randomness {
	int nextInt;

	public static void main(String[] args) {
		random();
		random1();
	}

	public static int random() {
		Random rn = new Random();
		int answer = rn.nextInt(2);
		if (answer == 0) {
			System.out.println("False");
		}
		if (answer == 1) {
			System.out.println("True");
		}
		return answer;
	}

	public static int random1() {
		Random rn = new Random();
		int answer1 = rn.nextInt(10);
		System.out.println("" + answer1);
		return answer1;
	}
}
