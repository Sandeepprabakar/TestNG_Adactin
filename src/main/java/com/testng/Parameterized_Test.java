package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({ "username", "password" })
	private void credentials(@Optional("sandeep1")String username, @Optional("yuvaraj66s")String password) {
		System.out.println("username:" + username);
		System.out.println("password :" + password);

	}
	
	@Test
	@Parameters({ "username", "password" })
	private void credentials1(@Optional("sandeep1")String username, @Optional("yuvaraj66s")String password) {
		System.out.println("username:" + username);
		System.out.println("password :" + password);
}
}
