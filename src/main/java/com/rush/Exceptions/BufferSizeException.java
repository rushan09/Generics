package com.rush.Exceptions;

public class BufferSizeException extends Exception{

	public String toString(){
		return "****Circular buffer is full!";
	}
}
