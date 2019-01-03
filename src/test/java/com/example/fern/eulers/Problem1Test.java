package com.example.fern.eulers;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

	@Test
	public void testSum() {
		Assert.assertEquals(23, Problem1.generateSum(10));
		System.out.println("Problem1: " + Problem1.generateSum(1000));
	}

	@Test
	public void testSum2() {
		Assert.assertEquals(23, Problem1.generateSum2(10));
		System.out.println("Problem1: " + Problem1.generateSum2(1000));
	}

}
