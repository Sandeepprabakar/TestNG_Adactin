package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept2_Soft {
	@Test
	private void hard_assert() {
		String username = "sandeep";
		String password = "yuvaraj6s";
		
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(username, password);
		System.out.println("failed");

		soft.assertNotEquals(username, password);
		System.out.println("successfull");

	}
	
	
	
	

}
