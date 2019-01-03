package com.example.fern.eulers;

import static com.example.fern.eulers.Problem1.apply;
import static com.example.fern.eulers.Problem1.apply2;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

	@Test
	public void test() {
		Assert.assertEquals(23, apply(10));
		System.out.println("Problem1: " + apply(1000));
	}

	@Test
	public void test2() {
		Assert.assertEquals(23, apply2(10));
		System.out.println("Problem1: " + apply2(1000));
	}

}
