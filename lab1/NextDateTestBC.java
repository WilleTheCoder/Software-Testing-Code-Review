package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class NextDateTestBC {

	private NextDate nd;
	 @BeforeEach
	    public void init() {
		nd = new NextDate(0, 0, 0);
	 }

	/*
	 * not valid date
	 */
	@Test
	public void TC1() {
		assertEquals("invalid Input Date", nd.run(1, 21, 2025));
	}
	
	/*
	 * month == 31
	 * day < 31
	 */
	@Test
	public void TC2() {
		assertEquals("1/29/2001", nd.run(1, 28, 2001));
	}
	/*
	 * month == 31
	 * day >= 31
	 */
	@Test
	public void TC3() {
		assertEquals("2/1/2001", nd.run(1, 31, 2001));
	}
	/*
	 * month != 31
	 * month == 30
	 * day < 30
	 */
	@Test
	public void TC4() {
		assertEquals("6/30/2001", nd.run(6, 29, 2001));
	}
	/*
	 * month != 31
	 * month == 30
	 * day >= 30
	 * day == 30
	 */
	@Test
	public void TC5() {
		assertEquals("7/1/2001", nd.run(6, 30, 2001));
		nd.run(6, 30, 2001);
	}

	/*
	 * month != 31
	 * month == 30
	 * day >= 30
	 * day != 30
	 */
	@Test
	public void TC6() {
		assertEquals("Invalid Input Date", nd.run(6, 31, 2001));
	}
	
	/*
	 * month != 31
	 * month != 30 
	 * month == December
	 * day <= 31
	 */
	@Test
	public void TC7() {
		assertEquals("1/1/2002", nd.run(12, 31, 2001));
	}
	
	/*
	 * month != 31
	 * month != 30 
	 * month == December
	 * day > 31
	 * year == 2021
	 * 
	 * ! 32 days !
	 */
	@Test
	public void TC8() {
		assertEquals("32 not allowed", nd.run(12, 32, 2021));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month == December
	 * day > 31
	 * year != 2021
	 * 
	 * ! 32 days !
	 */
	@Test
	public void TC9() {
		assertEquals("32 not allowed", nd.run(12, 32, 2001));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day < 28
	 * 
	 */
	@Test
	public void TC10() {
		assertEquals("2/26/2001", nd.run(2, 25, 2001));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day >= 28
	 * day == 28
	 * year == leap-year
	 */
	@Test
	public void TC11() {
		assertEquals("2/29/2016", nd.run(2, 28, 2016));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day >= 28
	 * day == 28
	 * year != leap-year
	 */
	@Test
	public void TC12() {
		assertEquals("3/1/2001", nd.run(2, 28, 2001));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day >= 28
	 * day != 28
	 * day == 29
	 * year == leap-year
	 */
	@Test
	public void TC13() {
		assertEquals("3/1/2016", nd.run(2, 29, 2016));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day >= 28
	 * day != 28
	 * day == 29
	 * year != leap-year
	 */
	@Test
	public void TC14() {
		assertEquals("Invalid Input Date", nd.run(2, 29, 2001));
	}

	/*
	 * month != 31
	 * month != 30 
	 * month != December
	 * month == February
	 * day >= 28
	 * day != 28
	 * day != 29
	 * day <=29
	 */
	@Test
	public void TC15() {
		assertEquals("Invalid Input Date", nd.run(2, 30, 2001));
	}
	
	/*
	 * Test July
	 */
	@Test
	public void TC16() {
		assertEquals("7/31/2001", nd.run(7, 30, 2001));
	}

	
}
