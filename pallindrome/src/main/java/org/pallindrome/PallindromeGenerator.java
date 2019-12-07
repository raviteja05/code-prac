package org.pallindrome;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.pallindrome.exception.InputRangeException;
import org.pallindrome.utils.PallindromeUtils;

public class PallindromeGenerator {

	private PallindromeUtils pallindromeUtils = new PallindromeUtils();
	
	/**
	 * This method takes inputRange and returns list of pallindromes in the range
	 * @param range
	 * @return
	 * @throws InputRangeException
	 */
	public List<BigInteger> pallindromeListForRange(int range) throws InputRangeException {

		List<BigInteger> pallindromeList = new ArrayList<BigInteger>();
		if (range <= 0 || range > 15) {
			throw new InputRangeException("Invalid input range ");
		} else {
			BigInteger minRange = pallindromeUtils.minRange(range);
			BigInteger maxRange = pallindromeUtils.maxRange(range);
			System.out.println("Input digit:"+ range);
			System.out.println(new StringBuilder("Range ").append(minRange).append("-").append(maxRange.subtract(BigInteger.ONE)));
			System.out.println("Possible pallindrome for range : "+range);
			for (BigInteger i = minRange; i.compareTo(maxRange) < 0; i = i.add(BigInteger.ONE)) {
				if (pallindromeUtils.isPallindrome(i)) {					
					pallindromeList.add(i);
					System.out.println(i);
				}

			}

			return pallindromeList;

		}
	}

}
