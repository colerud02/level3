import java.util.ArrayList;
import java.util.Random;

public class funWArraylists {

	public static void main(String[] args) {
		ArrayList<sucker> suckers = new ArrayList<sucker>();
		int total = 0;
		int x = 0;
		double b = 0;
		int temp = 0;
		for (int i = 0; i < 1000; i++) {
			Random r = new Random();
			x = r.nextInt(130) + 30;
			b = r.nextDouble() * 1000000;
			suckers.add(new sucker(x, b));

		}
		for (sucker sucker : suckers) {
			temp++;
			int iq = sucker.getIQ();
			double cash = sucker.getMoney();

			if (iq < 80 && cash > 500000) {
				total++;
			}
		}
		System.out.println(total);
	}
}
