package level3;

import java.util.ArrayList;
import java.util.Random;

public class longChipComp {
	public static void main(String[] args) {
		longChipComp lcc = new longChipComp();
		lcc.start();

	}

	public void start() {
		double temp;
		double temp2 = 0;
		String name = null;
		initializeBeatles();
		for (Beatle1 b : theBeatles) {
			ArrayList<Chip> c = b.getChips();
			for (Chip chip : c) {
				temp = chip.getLength();
				if (temp > temp2) {
					temp2 = temp;
					name = b.getName();

				}
			}

		}
		System.out.println(name+" has the longest chip!!");
	}

	/**
	 * The Beatles are eating lunch and playing a game to see who has the
	 * longest chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or
	 * Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 **/

	private ArrayList<Beatle1> theBeatles = new ArrayList<Beatle1>();

	private void initializeBeatles() {
		Beatle1 george = new Beatle1("George");
		Beatle1 john = new Beatle1("John");
		Beatle1 paul = new Beatle1("Paul");
		Beatle1 ringo = new Beatle1("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

}

class Beatle1 {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle1(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
