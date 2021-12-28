package com.testng;

import org.testng.annotations.Test;

public class Timeouts {
	@Test(timeOut = 9000)
	private void time() throws Throwable {
		Thread.sleep(2000);
		System.out.println("browserr launch");
		
		Thread.sleep(3000);
		System.out.println("signin");
		Thread.sleep(2000);
		System.out.println("signout");
		Thread.sleep(2000);
	}

}
