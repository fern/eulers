package com.example.fern.eulers;

import java.util.stream.IntStream;

/**
 * https://projecteuler.net/problem=1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

	public static int apply(int max) {
		int sum = 0;
		for (int i = 1; i < max; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static int apply2(int max) {
		return IntStream.range(1, max).filter(i -> ((i % 3 == 0) || (i % 5 == 0))).sum();
	}

}
