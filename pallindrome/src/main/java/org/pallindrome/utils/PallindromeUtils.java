package org.pallindrome.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PallindromeUtils {
	
	/**
	 * Method returns reverse of a given number
	 * @param number
	 * @return
	 */
	public  BigInteger reverseNumber(BigInteger number) {
		
		int length=number.toString().length();
		
		BigInteger reversedNumber = BigInteger.ZERO;
		
		BigInteger index=BigDecimal.valueOf( Math.pow(10,length-1)).toBigInteger();
		while(!number.divide(BigInteger.TEN).equals(BigInteger.ZERO)) {
			reversedNumber=reversedNumber.add(number.remainder(BigInteger.TEN).multiply(index));
			index=index.divide(BigInteger.TEN);
			number=number.divide(BigInteger.TEN);			
		}
		return reversedNumber.add(number);
	}
	
	/**
	 * Checks whether the number is pallindrome or not
	 * @param number
	 * @param reversedNumber
	 * @return
	 */
	public boolean isPallindrome(BigInteger number) {
		BigInteger reversedNumber=this.reverseNumber(number);
		return number.equals(reversedNumber);
	}
	
	/**
	 * calculates min range
	 * @param range
	 * @return
	 */
	public BigInteger minRange(int range) {
		
		return BigDecimal.valueOf(Math.pow(10, range-1)).toBigInteger();
		
	}
	/**
	 * calculates max range
	 * @param range
	 * @return
	 */
	public BigInteger maxRange(int range) {
		return BigDecimal.valueOf(Math.pow(10, range)).toBigInteger();
	}
	
	
		

	

}
