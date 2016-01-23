package level3;

import java.util.ArrayList;
import java.util.Collection;

public class plane {
	int numberOfPassengers;
	 snake s = new snake(numberOfPassengers, false);
	public static void main(String[] args) {
		
	}
	public plane() {
		// TODO Auto-generated constructor stub
		ArrayList <snake> Snakes = new ArrayList<snake>();
		for (int i = 0; i < 100; i++) {
			Snakes.add(new snake(i, false));
		}
		

	}
	
}
