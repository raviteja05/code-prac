package org.pallindrome.utils;



import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;



public class PallindromeUtilsTest {

	@Test
	public void testReverseNumber() {
		PallindromeUtils pallindromeUtils =new PallindromeUtils();
		BigInteger num=new BigInteger("12345");
		BigInteger checkReverse=new BigInteger("54321");
		
		Assert.assertTrue(checkReverse.equals(pallindromeUtils.reverseNumber(num)));
	}

	@Test
	public void testIsPallindrome() {
		PallindromeUtils pallindromeUtils =new PallindromeUtils();
		Assert.assertTrue(pallindromeUtils.isPallindrome(new BigInteger("12321")));
	}

	@Test
	public void testMinRange() {
		PallindromeUtils pallindromeUtils =new PallindromeUtils();
		Assert.assertTrue(pallindromeUtils.minRange(2).equals(new BigInteger("10")));
	}

	@Test
	public void testMaxRange() {
		PallindromeUtils pallindromeUtils =new PallindromeUtils();
		Assert.assertTrue(pallindromeUtils.maxRange(2).equals(new BigInteger("100")));
	}

}
