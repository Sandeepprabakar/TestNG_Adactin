package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Data {

	@Test(dataProvider = "testdata")
	private void data(String mailid, int password) {
		System.out.println();
		System.out.println("username:" + mailid);
		System.out.println("password :" + password);

	}
	@DataProvider
	private Object[][] testdata() {
		return new Object[][]{
	
		{"sathish",44},
		{"rabani",47},
		{"sandeep",41},
		
		{"sathish",44},
		{"rabani",47},
		{"sandeep",41},
		{"sathish",44},
		{"rabani",47},
		{"sandeep",41},
		
		};
		
		
	}}	
		
	
	
	

