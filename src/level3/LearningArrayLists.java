package level3;

import java.util.ArrayList;

public class LearningArrayLists {

	public static Object createArrayList() {
		ArrayList <String> List = new ArrayList<String>();
		return List;
	}

	public static void addToArrayList(ArrayList testList, String string) {
	testList.add(string);
		
	}

	public static Object getNumberOfItems(ArrayList testList) {
		
		return testList.size();
	}

	public static String getItem(ArrayList testList, int i) {
		
		return (String) testList.get(i);
	}

	public static String iterateOver(ArrayList<String> testList) {
String b = "";
for (String s : testList) {
	b = b+s;
	
}
		return b;
	}

	public static Object findItemOnList(ArrayList testList, String string) {
	int i= 	testList.indexOf(string);
		return i;
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.set(i, string);		
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);		
	}

	public static ArrayList<Integer> createTypedArrayList() {
		ArrayList <Integer> intlist = new ArrayList<Integer>();
		return intlist;
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		Integer i = 0;
		for (Integer integer : testList) {
			i = integer + i;
		}
		return i;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		
		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> testList) {
		String b = "";
		for (String s : testList) {
			b = b+s;
			
		}
		return b;
	}

}
