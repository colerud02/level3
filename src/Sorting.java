import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		Integer[] a = { 420, 69, 2 };
		List<Integer> sort = Arrays.asList(a);
		
		ArrayList<Integer> sorted = new ArrayList();
		for (Integer integer : sort) {
			int x = findMin(sort);
			sorted.add(x);
			System.out.println(""+sorted);
		}
	}

	

	private static Integer findMin(List<Integer> sort) {
		int min = 100000000;
		for (Integer i : sort) {
			if (min > i) {
				min = i;
				
			}
			//System.out.println(""+min);
			
		}
		int b =sort.indexOf(min);
		sort.set(b, 100000000);
		return min;
	}

	private static void AsList(int[] is) {
		// TODO Auto-generated method stub

	}
}
