import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int num = 0;
		for (String string : eggs) {
			if (eggs.get(num).equals("cracked")) {
				return num;
			}
			num++;
		}
		return num + 5;
	}

	public static int countPearls(List<Boolean> oysters) {
		int num = 0;
		int final1 = 0;
		for (Boolean boolean1 : oysters) {
			if (oysters.get(num).equals(true)) {
				final1++;
			}
			num++;
		}
		return final1;
	}

	public static double findTallest(List<Double> peeps) {
		int num = 0;
		double temp = 0;
		for (Double double1 : peeps) {
			if (double1 > temp) {
				temp = double1;
			}
		}
		return temp;
	}

	public static String findLongestWord(List<String> words) {
		String word = "";
		for (String string : words) {
			if (string.length() > word.length()) {
				word = string;
			}
		}
		return word;

	}

	public static boolean containsSOS(List<String> message2) {
		boolean yrn= false;
		for (String string : message2) {
			if (string.contains(" ... --- ... ")) {
				yrn = true;
			}
		}
		return yrn;
	}

}
