package org.pallindrome.main;

import org.pallindrome.PallindromeGenerator;
import org.pallindrome.exception.InputRangeException;

public class MainClass {
	public static void main(String[] args) {
		try {
			PallindromeGenerator pallindromeGenerator=new PallindromeGenerator();
			pallindromeGenerator.pallindromeListForRange(2);
			
			

		} catch (InputRangeException e) {
				e.printStackTrace();
		}
		
	}

}
