package com.rush.CircularBuffer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

import com.rush.Exceptions.BufferSizeException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CbTest {
	
	public static int SIZE_OF_BUFFER;
	static CircularBuffer cbObject;
	
	@BeforeClass
	public static void initClass()
	{
		System.out.println("----Stared the testing process");
		SIZE_OF_BUFFER=2;
		cbObject = new CircularBuffer(SIZE_OF_BUFFER);
	}
	
	@Before
	public void init()
	{
		System.out.println(" Before the test begins");
	}
	
	@Rule 
	public ErrorCollector error = new ErrorCollector();

	@Test
	public void offerTest() {
		System.out.println(" +Running offerTest");
		try {
			assertTrue(cbObject.offer(1));
			assertTrue(cbObject.offer(2));
			assertFalse(cbObject.offer(3));
		} catch (BufferSizeException e) {
			System.out.println(e);
			error.addError(e);			
		}		
	}
	
	@Test
	public void pollTest()
	{
		System.out.println(" +Running pollTest");
		assertEquals("Didn't get the expected value 1",1, cbObject.poll());
	}
	
	
	@After
	public void close()
	{
		System.out.println("  After the test excuted");
	}
	
	@AfterClass
	public static void closeClass()
	{
		System.out.println("----Closed the testing process");
	}
	

}
