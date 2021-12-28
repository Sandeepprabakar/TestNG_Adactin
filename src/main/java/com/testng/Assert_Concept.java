package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	private void hard_assert() {
		String username = "sandeep";
		String password = "yuvaraj6s";

		Assert.assertEquals(username, password);
		System.out.println("failed");

		Assert.assertNotEquals(username, password);
		System.out.println("successfull");

	}
	@Test
	private void hard_assert2() {
		String username = "sandeep";
		String password = "sandeep";

		Assert.assertEquals(username, password);

		System.out.println("successfull");

	}

}
