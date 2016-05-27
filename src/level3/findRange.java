package level3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class findRange {

	public static void main(String[] args) {

		ArrayList<Integer> numbs = new ArrayList<Integer>();
		int numbs1;
		Scanner s = new Scanner(System.in);
		numbs1 = GetuserInput(s);
		numbs.add(numbs1);
		numbs1 = GetuserInput(s);
		numbs.add(numbs1);
		if (numbs1 == 0) {
			System.out.println("ok. ur done");
			System.out.println("numbers u typed m8: " + numbs);
			int min = FindMin(numbs);
			int max = FindMax(numbs);
			int diff = max - min;
			System.out.println("the range of the numbers is: " + diff);
		}
	}

	private static int GetuserInput(Scanner s) {
		while (true) {
			try {
				int numbs1;
				System.out.println("Type numbers i guess...");
				s = new Scanner(System.in);
				numbs1 = s.nextInt();
				return numbs1;
			
			} catch (Exception e) {
				System.out.println("cant type that loser");
				
			}
		}
	}

	static int FindMin(ArrayList<Integer> a) {
		int min = Integer.MAX_VALUE;
		for (int b : a) {
			if (b < min) {
				min = b;
			}
		}
		System.out.println("the smallest number that u typed was: " + min + ". take the W kid.");
		return min;

	}

	static int FindMax(ArrayList<Integer> a) {
		int max = Integer.MIN_VALUE;
		for (int b : a) {
			if (b > max) {
				max = b;
			}
		}
		System.out.println("the biggest number that u typed was: " + max + ". take the L kid.");
		return max;

	}
}
