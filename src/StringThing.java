import static org.junit.Assert.*;

import org.junit.Test;

public class StringThing {

	@Test
	public void testStringManipulator() {
		StringManipulator sm = new StringManipulator();
		assertEquals("sdrowkcab",sm.reversword("backwords"));
		assertEquals("CAPITAL",sm.capitalizeword("capital"));
	}

}
