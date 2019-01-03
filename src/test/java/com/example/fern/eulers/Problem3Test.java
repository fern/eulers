package com.example.fern.eulers;

import static com.example.fern.eulers.Problem3.apply;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

	@Test
	public void test() {
		// 13195 are 5, 7, 13 and 29
		// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		
		Assert.assertEquals(29, apply(13195));
		System.out.println("Problem3: " + apply(600851475143L));
	}

}
