package com.rush.CircularBuffer.boilerplate;

public class TypeSafeCircularBuffer {
	
	private int writeCurser;
	private int readCurser;
	private int size;
	private String[] buffer;

	public TypeSafeCircularBuffer(int size)
	{
		buffer = new String[size];
		this.size = size;
		readCurser = 0;
		writeCurser = 0;
	}
	
	public boolean offer(String input)
	{
		if(buffer[writeCurser]!=null)
			return false;
		else
		{
			buffer[writeCurser] = input;
			writeCurser = next(writeCurser);
			return true;
		}
	}
	
	public String poll()
	{
		if(buffer[readCurser]==null)
			return null;
		else
		{
			String element = buffer[readCurser];
			buffer[readCurser] = null;
			readCurser = next(readCurser);
			return element;
		}
	}
	
	
	
	private int next(int curser)
	{
		return (curser+1) % size;		
	}
}
