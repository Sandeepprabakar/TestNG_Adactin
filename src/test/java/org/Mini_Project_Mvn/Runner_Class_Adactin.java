package org.Mini_Project_Mvn;

import java.awt.AWTException;

import java.awt.Robot;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.POMclass.Page_Object_Manager;
import com.base_class.Base_Class;
import com.helper.File_Reader_Manager;
import com.pom.Book_Hotel;
import com.pom.Booking_Confm;
import com.pom.Home_Page;
import com.pom.Logout;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Runner_Class_Adactin extends Base_Class {
	static Logger log = Logger.getLogger(Runner_Class_Adactin.class);
	public static WebDriver driver = browserlaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		
		
	 String url = File_Reader_Manager.filereadermanager().configurationreader().geturl();
	 url(url, "get");
		//url("https://adactinhotelapp.com/", "get");
		log.info("Session created");
		wait(4000);
	
		
	//	driver1(driver, "currenturl");
		String driver1 = driver1(url);
		System.out.println(driver1);

		clickonelement(pom.getHomepage().getUsername());
		String username = File_Reader_Manager.filereadermanager().configurationreader().getusername();
		inputelement(pom.getHomepage().getUsername(), username);
		//datadrriven using Excel
		//String particulardata = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx",1,3,5);
		//inputelement(pom.getHomepage().getUsername(), particulardata);

		clickonelement(pom.getHomepage().getPassword());
		String password = File_Reader_Manager.filereadermanager().configurationreader().getpassword();
		inputelement(pom.getHomepage().getPassword(), password);
		//String particulardata2 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1,4,5);
		//inputelement(pom.getHomepage().getPassword(), particulardata2);

		clickonelement(pom.getHomepage().getLogin_Btn());
		wait(20);
		log.info("Successfully logged in");

		dropdown(pom.getSearchhotel().getLocation(), "index", "5");
		wait(20);
		dropdown(pom.getSearchhotel().getHotels(), "value", "Hotel Sunshine");
		wait(20);

		dropdown(pom.getSearchhotel().getRoomtype(), "text", "Deluxe");
		wait(20);

		dropdown(pom.getSearchhotel().getRoomnos(), "value", "2");
		wait(20);

		dropdown(pom.getSearchhotel().getAdultroom(), "index", "3");
		wait(20);

		dropdown(pom.getSearchhotel().getChildroom(), "index", "3");
		wait(20);

		clickonelement(pom.getSearchhotel().getSubmit());

		clickonelement(pom.getSelecthotel().getRadiobutton());

		clickonelement(pom.getSelecthotel().getContinue1());

		wait(20);

		clickonelement(pom.getBookhotel().getFirstname());
		String firstname = File_Reader_Manager.filereadermanager().configurationreader().getfirstname();
		inputelement(pom.getBookhotel().getFirstname(), firstname);
	//datadriven using excel	
		//String particulardata3 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx",1,15,5);
		//(pom.getBookhotel().getFirstname(), particulardata3);

		clickonelement(pom.getBookhotel().getLastname());
		String lastname = File_Reader_Manager.filereadermanager().configurationreader().getlastname();
		inputelement(pom.getBookhotel().getLastname(), lastname);
	//	String particulardata4 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1,16,5);
		//inputelement(pom.getBookhotel().getLastname(), particulardata4);

		clickonelement(pom.getBookhotel().getAddress());
		String particulardata5 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1,17,5);
		inputelement(pom.getBookhotel().getAddress(), particulardata5);

		clickonelement(pom.getBookhotel().getCcvnum());
		String cardnumber = File_Reader_Manager.filereadermanager().configurationreader().getcardnumber();
		inputelement(pom.getBookhotel().getCcvnum(), cardnumber);
		//String particulardata6 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1,18,5);
		//	inputelement(pom.getBookhotel().getCcvnum(), particulardata6);

		dropdown(pom.getBookhotel().getCcvtype(), "index", "2");

		dropdown(pom.getBookhotel().getCcvmonth(), "index", "11");
		dropdown(pom.getBookhotel().getCcvyear(), "index", "5");
		
		clickonelement(pom.getBookhotel().getCcv());
		String ccv = File_Reader_Manager.filereadermanager().configurationreader().getccv();
		inputelement(pom.getBookhotel().getCcv(), ccv);
			//String particulardata7 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1, 22, 5);
			//inputelement(pom.getBookhotel().getCcv(), particulardata7);

			clickonelement(pom.getBookhotel().getBooknow());

		Thread.sleep(10000);
		wait(10);

		wait(50);

		clickonelement(pom.getBookingconfm().getItinerary());
		log.fatal("Sucessfully booked the hotel");

		Thread.sleep(5000);
		wait(5);
		screenshot("Runner_class");

		Thread.sleep(5000);

		clickonelement(pom.getLogout().getLogout());
		wait(20);
		screenshot("Runner_Class2");

	}

}
