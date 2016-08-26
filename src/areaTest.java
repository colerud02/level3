import static org.junit.Assert.*;

import org.junit.Test;

public class areaTest {

	@Test
	public void testShapeCalculator() {
		ShapeCalculator sc = new ShapeCalculator();
		assertEquals(20,sc.calcSquarePerimeter(5));
		assertEquals(16,sc.calcRectPerimeter(3,5));
		assertEquals(50.265,sc.calcCircleArea(4),0.001);
		assertEquals(25.132,sc.calcCirclePerimeter(4),0.001);s
	}

}
