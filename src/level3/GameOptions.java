package level3;

import java.util.HashMap;

public class GameOptions {
	static HashMap<String,String> Options = new HashMap<String,String>();
	public static void addOption(String option, String Value){
		Options.put(option, Value);
		
	}
	String getOption(String option){
		return Options.get(option);
	}
	public static void main(String[] args) {
		addOption("Jack loves", "HalfLife");
		addOption("Life Half", "Loves Jack");
		addOption("efiL flaH", "sevoL kcaJ");
	System.out.println(Options.get("Jack loves").equals("HalfLife"));	
		
	}

}
