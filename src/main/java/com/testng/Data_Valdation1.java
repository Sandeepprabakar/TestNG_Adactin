package com.testng;


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.base_class.Base_Class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Valdation1 extends Base_Class {
	@Test
	public void validate_Data() throws Throwable {
		String particulardata = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\AdactinPostman.xlsx",0,15,2);
		
		RestAssured.baseURI=particulardata;
		RequestSpecification request = RestAssured.given();
		String particulardata2 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\AdactinPostman.xlsx",0,15,3);
		
		
		Response response = request.get(particulardata2);
		String reponse_Body = response.asString();
		//System.out.println(reponse_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code :" + statusCode);
		Assert.assertEquals(200, statusCode);
		System.out.println("Successfull");
		
		ResponseBody body = response.getBody();
		System.out.println("Body :" + body);
		
		String sessionId = response.getSessionId();
		System.out.println("Session ID :" +sessionId);
		
		long time = response.getTime();
		System.out.println("Time :" + time);
		
		String statusLine = response.getStatusLine();
		System.out.println("StatusLine :" + statusLine);
		
		
		
	
	}

}
