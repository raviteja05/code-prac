package org.pallindrome;



import java.math.BigInteger;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.pallindrome.exception.InputRangeException;

@RunWith(JUnit4.class)
public class PallindromeGeneratorTest {

	@Test
	public void testPallindromeListForRange() {
		
		PallindromeGenerator pallindromeGenerator=new PallindromeGenerator();
		int range=2;
		BigInteger[] expectedList= {new BigInteger("11"), new BigInteger("22"),new BigInteger("33"),new BigInteger("44"),new BigInteger("55"),new BigInteger("66"),new BigInteger("77"),new BigInteger("88"),new BigInteger("99")};
		
		
		try {
			List<BigInteger> outputList=pallindromeGenerator.pallindromeListForRange(range);
			int i=0;
			boolean result=true;
			for(BigInteger output:outputList) {
				result=result&&output.equals(expectedList[i]);
				
				i++;
				
			}
			Assert.assertTrue(result);
			
		} catch (InputRangeException e) {
			
			e.printStackTrace();
		}
	}
	@Test(expected=InputRangeException.class)
	public void testPallindromeListForNegativeRange() throws InputRangeException{
		
		PallindromeGenerator pallindromeGenerator=new PallindromeGenerator();
		int range=-2;
		pallindromeGenerator.pallindromeListForRange(range);
			
			
		
	}
	@Test(expected=InputRangeException.class)
	public void testPallindromeListForZeroRange() throws InputRangeException{		
		PallindromeGenerator pallindromeGenerator=new PallindromeGenerator();
		int range=0;
		pallindromeGenerator.pallindromeListForRange(range);			
		
	}
	@Test(expected=InputRangeException.class)
	public void testPallindromeListForOutOFRange() throws InputRangeException{		
		PallindromeGenerator pallindromeGenerator=new PallindromeGenerator();
		int range=16;
		pallindromeGenerator.pallindromeListForRange(range);			
		
	}
	

}
