package com.example.fern.eulers;

import static com.example.fern.eulers.Problem2.apply;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

	@Test
	public void test() {
		// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		
		Assert.assertEquals(2, apply(8));
		Assert.assertEquals(10, apply(10));
		Assert.assertEquals(44, apply(50));
		System.out.println("Problem2: " + apply(4000000));
	}

}
