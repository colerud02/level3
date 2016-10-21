import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void testStarString() {
		main1 m = new main1();
	assertEquals("***de***",m.starString("abcdefgh","de"));
	assertEquals("1***", m.starString("1234","1"));
	assertEquals("r*****r",m.starString("racecar","r"));
	}
	@Test
	public void testAddSpecial(){
		main1 m = new main1();
		assertEquals(6,m.addSpecial(1,2,3));
		assertEquals(10,m.addSpecial(4,6,4));
		assertEquals(2,m.addSpecial(2,2,2));
		
	}
	@Test
	public void testCountEvens(){
		main1 m = new main1();
		int[] t1 = {1,2,3,4};
		int[] t2 = {2,2,2,2,2};
		int[] t3 = {8,6,7,5,3,0,9};
		assertEquals(2,m.countEvens(t1));
		assertEquals(5,m.countEvens(t2));
		assertEquals(3,m.countEvens(t3));
	}

	



}
