package lab2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TriangleTest for testing the Triangle class. This template is used in the
 * exercise phase 1. Students should add relevant unit test cases related to the
 * Triangle class to this class.
 */
public class TriangleTestBVA {
	private Triangle triangle;

	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		triangle = new Triangle(0, 0, 0);
	}

	@After
	/*
	 * Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		triangle = null;
	}

	@Test
	public void TC1() {
		triangle.setSideLengths(1, 1, 1);
		assertTrue("Should return true for a equilateral triangle", triangle.isEquilateral());
		assertEquals(triangle.getSideLengths(), "1,1,1");
		assertEquals("Should return 'equilateral'", "equilateral", triangle.classify());
		assertEquals(triangle.getArea(), 0.433, 0.1);
		assertEquals(triangle.getPerimeter(), 3);
	}
	
	@Test
	public void TC2() {
		triangle.setSideLengths(2, 2, 3);
		assertTrue("Should return true for a isosceles triangle", triangle.isIsosceles());
		assertEquals("Should return 'isosceles'", "isosceles", triangle.classify());
	}
	
	@Test
	public void TC3() {
		triangle.setSideLengths(3, 4, 5);
		assertTrue("Should return true for a right-angled triangle", triangle.isRightAngled());
		assertEquals("Should return 'right-angled'", "right-angled", triangle.classify());
	}
	
	@Test
	public void TC4() {
		triangle.setSideLengths(2, 6, 7);
		assertTrue("Should return true for a scalene triangle", triangle.isScalene());
		assertEquals("Should return 'scalene'", "scalene", triangle.classify());
	}
	
	@Test
	public void TC5() {
		triangle.setSideLengths(1, 1, 2);
		assertTrue("Should return true for a impossible triangle", triangle.isImpossible());
		assertEquals(triangle.getSideLengths(), "1,1,2");
		assertEquals("Should return 'impossible'", "impossible", triangle.classify());
		assertEquals(triangle.getArea(), -1, 0.1);
		assertEquals(triangle.getPerimeter(), 4);
	}
	
	@Test
	public void TC6() {
		triangle.setSideLengths(0, 0, 0);
		assertEquals(triangle.getPerimeter(), -1);
	}
}