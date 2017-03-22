package com.rush.CircularBuffer.boilerplate;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TypeSafeCircularBufferTest {
	static TypeSafeCircularBuffer circularBuffer;
	
	@BeforeClass
	public static void init()
	{
		circularBuffer = new TypeSafeCircularBuffer(3);
	}
	

	@Test
	public void testOffer() {
		assertEquals("Didn't insert properly", true , circularBuffer.offer("a"));
		assertEquals("Didn't insert properly", true , circularBuffer.offer("b"));
		assertEquals("Didn't insert properly", true , circularBuffer.offer("cd"));
		assertEquals("Didn't insert properly", false , circularBuffer.offer("e"));
	}

	@Test
	public void testPoll() {
		assertEquals("Didn't insert properly", "a" , circularBuffer.poll());
	}

}
