
public class main1 {
	String starString(String string, String string2) {
		Boolean tof = false;
		String final1 = "";
		char c = ' ';
		for (int i = 0; i < string.length(); i++) {
			tof = false;
			for (int j = 0; j < string2.length(); j++) {
				if (string.charAt(i) == string2.charAt(j)) {
					tof = true;
					c = string2.charAt(j);
				} 
			}
			if (tof == true) {
				final1 += c;
				System.out.println(string.charAt(i));
				tof = false;
			}
			else {
				final1 += "*";
				//System.out.println(string2.charAt(j));
			}
		}
		System.out.println(final1);
		return final1;
	}

	public Object addSpecial(int i, int j, int k) {
		int final1 = 0;
		if (i == j || i == k) {
			i = 0;
		}
		if (j == i || j == k) {
			j = 0;
		}
		if (k == i || k == j) {
			k = 0;
		}
		final1 = i + j + k;
		return final1;
	}

	public int countEvens(int[] t1) {
		int finalnum = 0;
for (int i = 0; i < t1.length; i++) {
	if (t1[i]%2 == 0) {
		finalnum++;
	}
}
		return finalnum;
	}
}
