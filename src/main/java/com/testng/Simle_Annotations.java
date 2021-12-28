package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simle_Annotations {
	@BeforeSuite
	private void setproperty() {
		System.out.println("setproperty");
	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("browserlaunch");
	}
	@BeforeClass
	private void url() {
		System.out.println("URL");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test	
	private void eveningdress() {
		System.out.println("evening dress");
	}
	@Test
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
	@AfterClass
	public void verify() {
		System.out.println("verify");

	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	@AfterSuite
	private void clearcookies() {
		System.out.println("cookies");
	}
	
}
