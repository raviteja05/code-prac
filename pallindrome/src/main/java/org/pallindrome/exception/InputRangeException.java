package org.pallindrome.exception;

public class InputRangeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InputRangeException(String error) {
		System.err.print(error);
	}

}
