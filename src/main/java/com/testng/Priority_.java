package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_ {
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
	
	@Test(priority = -2)	
	private void eveningdress() {
		System.out.println("evening dress");
	}
	
	@Test(priority = 1)
	private void printedress() {
		System.out.println("printeddress");
	}
	
	@Test(priority = 0)
	private void shipping() {
		System.out.println("shipping");
	}
	@Ignore
	@Test(priority = -1)
	private void quit() {
		System.out.println("quit");
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
