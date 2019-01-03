package com.example.fern.eulers;

/**
 * https://projecteuler.net/problem=3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

	public static long apply(long value) {
		// find next factor for value.
		long max = 1;
		long curval = value;
		for (long i = 2; i <= curval; i++) {
			if (curval % i == 0) {
				// i is a factor
				max = Math.max(max, i);
				curval = curval / i;
			}
		}
		return max;
	}

}
