package Stack;

import java.util.Stack;

public class Burger {
	public enum INGREDIENTS {BREAD, STEAK, LETTUCE, BACON, CHEESE, CHOCOLATECHIPCOOKIE, BURIOTO, TACO, SMALLCHILD};
	public Stack<INGREDIENTS> burger = new Stack<INGREDIENTS>();
	
	public void addCombo(Combo combo) {
		//TODO
		burger.add(INGREDIENTS.BREAD);
		burger.addAll(combo.getComboStack());
		//burger.add(INGREDIENTS.BREAD);
	}
	
	public Burger() {
		//burger.add(INGREDIENTS.BREAD);
	}
	
	public void finishBurger() {
		burger.add(INGREDIENTS.BREAD);
	}
	
	@Override
	public String toString() {
		return burger.toString();
	}
	
	public int getNumberOfBread() {
		int breadnum = 0;
		while(!burger.isEmpty()){
			if (burger.pop()== INGREDIENTS.BREAD) {
				breadnum ++;
			}
		}
		
		return breadnum;
	}
	
	public int getNumberOfSteak() {
		return 0;
	}
}
