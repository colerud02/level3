
public class ShapeCalculator {
	int calcSquarePerimeter(int side) {
		int finalNum = 0;
		finalNum = side * 4;
		return finalNum;
	}

	int calcRectPerimeter(int side, int side1) {
		int finalNum = 0;
		int temp = 0;
		int temp1 = 0;
		temp = side * 2;
		temp1 = side1 * 2;
		finalNum = temp + temp1;
		return finalNum;

	}

	double calcCircleArea(double radius) {
		double finalnum = 0;
		finalnum = Math.PI * radius * radius;
		return finalnum;
	}

	double calcCirclePerimeter(double radius) {
		double finalnum=0;
		finalnum= 2*Math.PI*radius;
		return finalnum;
		
	}
}
