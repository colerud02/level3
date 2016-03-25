package Stack;

import java.util.Scanner;
import java.util.Stack;

public class AlligatorFastFood {
	private static Scanner scanner = new Scanner(System.in);
	private static Combo combo1;
	private static Combo combo2;
	private static Combo combo3;
	private static Combo[] combos;

	public static void main(String[] args) {
		sayHi();
		createCombos();
		Combo[] combos = { combo1, combo2, combo3 };
		Burger burger = new Burger();
		boolean wantsMore = true;
		while (wantsMore) {
			askCombo();
			int choice = getAnswer();
			if (choice == 0)
				wantsMore = false;
			else
				burger.addCombo(combos[choice-1]);
		}
		burger.finishBurger();
		System.out.println("You order the burger: " + burger.toString());
		System.out.println(burger.getNumberOfBread()+" peices of bread!");
	}

	public static void createCombos() {
		combo1 = new Combo();
		combo1.addIngredient(Burger.INGREDIENTS.SMALLCHILD);
		combo1.addIngredient(Burger.INGREDIENTS.BACON);
		combo1.addIngredient(Burger.INGREDIENTS.CHEESE);
		combo2 = new Combo();
		combo2.addIngredient(Burger.INGREDIENTS.CHEESE);
		combo2.addIngredient(Burger.INGREDIENTS.CHOCOLATECHIPCOOKIE);
		combo2.addIngredient(Burger.INGREDIENTS.TACO);
		combo3 = new Combo();
		combo3.addIngredient(Burger.INGREDIENTS.LETTUCE);
		combo3.addIngredient(Burger.INGREDIENTS.BURIOTO);
		combo3.addIngredient(Burger.INGREDIENTS.CHEESE);

	}

	private static void sayHi() {
		System.out.println("Hi there, here are the combo you can use in our burgers:");
	}

	private static void askCombo() {
		System.out.println("Here is the list of combos you can add to your burger:");
		System.out.println("1. " + combo1.toString());
		System.out.println("2. " + combo2.toString());
		System.out.println("3. " + combo3.toString());
	}

	private static int getAnswer() {
		int choice = -1;
		while (choice < 0 || choice > 3) {
			System.out.println("Type the number of the combo wou want to add, or 0 if you are done.");
			try {
				choice = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Could not understand that, please try again");
				continue;
			}
		}
		return choice;
	}
}
