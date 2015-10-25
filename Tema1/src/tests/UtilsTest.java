package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import tema.Utils;

public class UtilsTest {

	@Test
	public final void testFibonacci() {
//		fail("Not yet implemented");
		assertTrue(Utils.fibonacci(3) == 2);
	}

	@Test
	public final void testPrimTest() {
//		fail("Not yet implemented");
		int n = 7;
		assertTrue(Utils.primTest(n));
	}

}
