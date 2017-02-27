package testMyInteger;

import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Integer.Myinteger;

public class testMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMyInteger() {
		
		int iValue= 8;	
		boolean odd5 = true;
		boolean even5 = false;
		boolean prime5 = true;
		Myinteger myint1= new Myinteger(4);
	
		assertEquals(myint1.isEven(),true);
		assertEquals(myint1.isOdd(),false);
		
		
		
	}

}
