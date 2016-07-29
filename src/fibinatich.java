
public class fibinatich {

	public static void main(String[] args) {
		long num0 = 0;
		long num1 = 0;
		long total = 1;
		for (long i = 0; i < 50; i++) {
			System.out.println(total);
			num1 = total;
			total = num0 + num1;
			num0 = num1;
			
			
		}
	}
}
