package com.rush.CircularBuffer.generics;

import com.rush.Exceptions.BufferSizeException;

public class GenericCircularBuffer<T> {
	
	private T[] buffer;
	private int readCurser;
	private int writeCurser;
	
	public GenericCircularBuffer(int size){
		this.buffer = (T[]) new Object[size];
		readCurser = 0;
		writeCurser = 0;
	}
	
	public Boolean offer(T input) throws BufferSizeException
	{
		if(buffer[writeCurser]!=null)
		{
			throw new BufferSizeException();
		}
		buffer[writeCurser] = input;
		writeCurser = next(writeCurser);
		return true;
	}

	public T poll()
	{
		if(buffer[readCurser]==null)
			return null;
		
		T obj = buffer[readCurser];
		buffer[readCurser] = null;
		readCurser = next(readCurser);
		return obj;
	}


	private int next(int curser)
	{
		return (curser+1) % buffer.length;
	}
}
