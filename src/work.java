
public class work {
	public String repeatWithChar(String one, String two, int num) {
		String final1 = "";
		for (int i = 0; i < num - 1; i++) {
			final1 += one;
			final1 += two;
		}
		final1 += one;
		return final1;

	}

	public Boolean hasRepeatedChar(String s) {
		Boolean tf = null;
		int numat = 0;
		char letter;
		for (int i = 0; i < s.length(); i++) {
			letter = s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(j)==letter) {
					System.out.println("true");
					return true;
				}
				
			}
			
		}
		
		return false;
	}
}
