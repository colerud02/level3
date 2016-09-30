import static org.junit.Assert.*;

import org.junit.Test;

public class test {
work w = new work();
	@Test
	public void testRepeatWithChar(){
		String s1 = "bobxbobxbob";
		String s2 = "AabcAabcAabcA";
		assertEquals(s1,w.repeatWithChar("bob","x",3));
		assertEquals(s2,w.repeatWithChar("A","abc",4));
	}
	@Test
	public void testRepeatedChar(){
		String s1 = "turtle";
		String s2 = "name";
		String s3 = "ladder";
		String s4 = "computer";
		assertTrue(w.hasRepeatedChar(s1));
		assertFalse(w.hasRepeatedChar(s2));
		assertTrue(w.hasRepeatedChar(s3));
		assertFalse(w.hasRepeatedChar(s4));

	}
	

}
