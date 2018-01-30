import org.junit.*;
import static org.junit.Assert.*;

/**
 * Test class for class <code>Fraction</code>. 
 *
 * PLEASE COMPLETE STUBBED METHODS AND INCOMPLETE
 * DOCUMENTATION. 
 *
 * @author	Franklin D. Worrell
 * @version	15 January 2017
 */ 
public class FractionTest {
	private Fraction fract1; 
	private Fraction fract2;
	private Fraction fract3; 
	private Fraction fract4; 	// has a numerator of zero
	
	/**
	 * Creates test fixtures before each test is run. 
	 */ 
	@Before
	public void setUp() {
		fract1 = new Fraction(1, 2); 
		fract2 = new Fraction(7, 3); 
		fract3 = new Fraction(5, -5); 
		fract4 = new Fraction(0, 4); 
	} // end method setUp
	
	/**
	 * Tests the <code>getNumerator</code> method of <code>Fraction</code>. 
	 */ 
	@Test 
	public void testGetNumerator() {
		assertEquals(1, fract1.getNumerator()); 
		assertEquals(7, fract2.getNumerator()); 
		assertEquals(5, fract3.getNumerator()); 
		assertEquals(0, fract4.getNumerator()); 
	} // end method testGetNumerator
	
	/**
	 * 
	 */ 
	@Test
	public void testGetDenominator() {
		/* Stubbed */ 
	} // end method testGetDenominator
	
	/**
	 * Tests the <code>equals</code> method of <code>Fraction</code>. 
	 * Recall the contract for equals. The tests should ensure that 
	 * all aspects of that contract are fulfilled. 
	 */ 
	@Test
	public void testEquals() { 
		String word = "Hello"; 
		assertFalse(fract1.equals(word)); 			// argument is of wrong type
		Fraction nullFract = null; 
		assertFalse(fract4.equals(nullFract)); 		// null vs non-null references
		assertFalse(fract1.equals(fract2)); 
		assertTrue(fract3.equals(fract3)); 			// reflexivity
		assertEquals(new Fraction(7, 3), fract2); 
		assertEquals(fract2, new Fraction(7, 3)); 	// symmetry
		Fraction transitiveTestFract1 = new Fraction(2, 4); 
		Fraction transitiveTestFract2 = new Fraction(4, 8); 
		assertEquals(fract1, transitiveTestFract1); 
		assertEquals(transitiveTestFract1, transitiveTestFract2); 
		assertEquals(fract1, transitiveTestFract2);	// transitivity
		assertFalse(fract4.equals(new Fraction(1, 4)));
		assertTrue(fract4.equals(new Fraction(0, -4))); 
		assertTrue(fract1.equals(new Fraction(1, 2))); 
		assertEquals(new Fraction(5, -5), fract3); 
		assertEquals(fract3, new Fraction(1, -1)); 
	} // end method testEquals 
	
	/**
	 * Tests the <code>hashCode</code> method of <code>Fraction</code>. 
	 * If a call to equals on two objects would return true, then the
	 * two objects should have the same hash code.
	 */ 
	@Test 
	public void testHashCode() {
		assertFalse(fract1.hashCode() == fract2.hashCode()); 
		assertTrue(fract3.hashCode() == fract3.hashCode()); 
		assertEquals((new Fraction(7, 3)).hashCode(), fract2.hashCode()); 
		assertFalse(fract4.hashCode() == (new Fraction(1, 4)).hashCode()); 
		assertTrue((new Fraction(5, -5)).hashCode() == fract3.hashCode()); 
		assertTrue(fract1.hashCode() == (new Fraction(2, 4)).hashCode()); 
		assertTrue(fract1.hashCode() == (new Fraction(4, 8)).hashCode()); 
		assertTrue((new Fraction(1, -1)).hashCode() == fract3.hashCode()); 
	} // end method testHashCode
	
	/**
	 * Tests the <code>toString</code> method of <code>Fraction</code>.
	 */ 
	@Test
	public void testToString() {
		/* Stubbed */ 
	} // end method testToString
	
	/**
	 * Tests the <code>add</code> method of <code>Fraction</code>. 
	 * This test utilizes a few different methods of comparing values,
	 * including using the other, already tested methods of 
	 * <code>Fraction</code>. 
	 */ 
	@Test
	public void testAdd() {
		assertEquals("17 / 6", fract1.add(fract2).toString()); 
		assertEquals(new Fraction(-20, -15), fract2.add(fract3)); 
		assertEquals(28, fract4.add(fract2).getNumerator()); 
		assertEquals(12, fract4.add(fract2).getDenominator()); 
		assertEquals("5 / -10", fract3.add(fract1).toString()); 
		assertEquals(new Fraction(-4, 4), fract1.add(new Fraction(-3, 2))); 
	} // end method testAdd 
	
	/**
	 * 
	 */ 
	@Test
	public void testSubtract() {
		/* Stubbed */ 
	} // end method testSubtract
	
	/** 
	 * 
	 */ 
	@Test
	public void testMultiply() {
		/* Stubbed */ 
	} // end method testMultiply
	
	/**
	 * Tests <code>divide</code> method of <code>Fraction</code> and 
	 * ensures that exception is being thrown appropriately. 
	 */ 
	@Test
	public void testDivide() {
		/* Stubbed */ 
	} // end method testDivide		
} // end class FractionTest1