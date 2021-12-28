package com.testng;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Expected_exception {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void exceptedexception() {
		System.out.println(10/0);
	}
	
	@Test(expectedExceptions = Exception.class)
	private void exception() {
		Scanner S = new Scanner(System.in);
		int nextInt = S.nextInt();
		System.out.println(nextInt);
	}

}
