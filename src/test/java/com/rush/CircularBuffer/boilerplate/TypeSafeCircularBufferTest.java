package com.rush.CircularBuffer.boilerplate;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.rush.CircularBuffer.generics.GenericCircularBuffer;
import com.rush.Exceptions.BufferSizeException;

public class TypeSafeCircularBufferTest {
	static GenericCircularBuffer<String> circularBuffer;
	
	@BeforeClass
	public static void init()
	{
		circularBuffer = new GenericCircularBuffer<String>(5);
	}
	

	@Test
	public void testOffer() {
		try {
			assertEquals("Didn't insert properly", true , circularBuffer.offer("a"));
			assertEquals("Didn't insert properly", true , circularBuffer.offer("b"));
			assertEquals("Didn't insert properly", true , circularBuffer.offer("cd"));
		} catch (BufferSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testPoll() {
		assertEquals("Didn't insert properly", "a" , circularBuffer.poll());
	}

}
