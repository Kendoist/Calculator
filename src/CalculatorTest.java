import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		cal.clear();
	}

	@Test
	public void testAdd1() {
		cal.add(20);
		assertEquals(20,cal.getResult());
	}

	@Test
	public void testAdd2() {
		cal.add(20);
		cal.add(20);
		assertEquals(40,cal.getResult());
	}
	
	@Test
	public void testSubstract1() {
		cal.substract(10);
		assertEquals(-10,cal.getResult());
	}

	@Test
	public void testSubstract2() {
		cal.add(20);
		cal.substract(10);
		assertEquals(10,cal.getResult());
	}
	
	@Test
	public void testMultiply1() {
		cal.add(20);
		cal.multiply(10);
		assertEquals(200,cal.getResult());
	}
	
	@Test
	public void testMultiply2() {
		cal.substract(20);
		cal.multiply(10);
		assertEquals(-200,cal.getResult());
	}

	@Test
	public void testDivide() {
		cal.add(20);
		cal.divide(10);
		assertEquals(2,cal.getResult());
	}

	@Test
	public void testSquare() {
		cal.square(20);
		assertEquals(400,cal.getResult());
	}

	@Test(timeout=20)
	public void testSquareRoot() {
		cal.squareRoot(16);
		assertEquals(4,cal.getResult());
	}

	@Test
	public void testClear() {
		cal.add(20);
		cal.clear();
		assertEquals(0,cal.getResult());
	}

	@Test
	public void testGetResult() {
		
	}

}
