package com.rush.CircularBuffer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CbTest {

	@Test
	public void test() {
		CircularBuffer cb = new CircularBuffer(2);
		
		assertTrue(cb.offer(1));
		assertTrue(cb.offer(2));
		assertEquals(1,cb.poll());
		assertTrue(cb.offer(3));
		assertEquals(2,cb.poll());
		
				
//		fail("Not yet implemented");
	}

}
