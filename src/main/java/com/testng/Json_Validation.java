package com.testng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class Json_Validation {
	@Test
public void method1() throws Throwable {
	// TODO Auto-generated method stub


		File f = new File(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\src\\main\\java\\com\\payload\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) parse;
		Object object = jsonobj.get("Covidshield");
		String string = object.toString();
		System.out.println("Covidshield :" + string);

	}
	@Test
	public void method2() throws Throwable {

	
		File f = new File(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\src\\main\\java\\com\\payload\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) parse;
		Object object = jsonobj.get("Covaxin");
		String string = object.toString();
		System.out.println("Covaxin :" + string);

	
	}

}
