package Stack;

import java.util.Stack;

public class Combo {
	public Stack<Burger.INGREDIENTS> combo = new Stack<Burger.INGREDIENTS>();
	
	public Stack<Burger.INGREDIENTS> getComboStack() {
		return combo;
	}
	
	public void addIngredient(Burger.INGREDIENTS ingredient) {
		//TODO
		combo.add(ingredient);
		
		
	}
	
	@Override
	public String toString() {
		return combo.toString();
	}
}
