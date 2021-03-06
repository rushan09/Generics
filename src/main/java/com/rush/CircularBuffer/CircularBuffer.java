package com.rush.CircularBuffer;

import com.rush.Exceptions.BufferSizeException;

public class CircularBuffer {

	private Object[] buffer;
	private int writeCurser=0;
	private int readCurser=0;
	
	public CircularBuffer(int size)
	{
		buffer = new Object[size];
	}
	
	public Boolean offer(Object insert) throws BufferSizeException
	{
		if(buffer[writeCurser]!=null)
		{
			throw new BufferSizeException();
		}
		buffer[writeCurser]=insert;
		writeCurser = next(writeCurser);
		return true;
	}
	
	public Object poll()
	{
		if(buffer[readCurser]==null)
		{
			return null;
		}
		Object readObject = buffer[readCurser];
		buffer[readCurser] = null;
		readCurser = next(readCurser);
		return readObject;
	}

	private int next(int curser) {
		return (curser+1) % buffer.length;
	}
	
	
	
}
