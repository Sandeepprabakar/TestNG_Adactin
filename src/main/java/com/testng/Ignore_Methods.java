package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Methods {
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test	
	private void eveningdress() {
		System.out.println("evening dress");
	}
	@Test(enabled = false)
	
	private void printedress() {
		System.out.println("printeddress");
	}
	@Test
	private void shipping() {
		System.out.println("shipping");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterSuite
	private void quit() {
		System.out.println("Quit");
	}
	
}
	
	
	
	

