package org.Mini_Project_Mvn;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.POMclass.Page_Object_Manager;
import com.base_class.Base_Class;
import com.helper.File_Reader_Manager;

public class Testng_Runner_class_Adactin extends Base_Class {
	static Logger log = Logger.getLogger(Testng_Runner_class_Adactin.class);
	public static WebDriver driver= browserlaunch("chrome");
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	/*
	 * System.setProperty("webdriver.edge.driver",
	 * "C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project\\driver\\msedgedriver.exe"
	 * ); WebDriver driver = new EdgeDriver();
	 */

	@Test(priority = -1, groups = "hotel")
	private void hotelbooking() throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager.filereadermanager().configurationreader().geturl();
		url(url, "get");
		log.info("Session created");
		wait(4000);

		String driver1 = driver1(url);
		System.out.println(driver1);
		String driver12 = driver1("title");
		System.out.println(driver12);

		clickonelement(pom.getHomepage().getUsername());
		String username = File_Reader_Manager.filereadermanager().configurationreader().getusername();
		inputelement(pom.getHomepage().getUsername(), username);

		clickonelement(pom.getHomepage().getPassword());
		String password = File_Reader_Manager.filereadermanager().configurationreader().getpassword();
		inputelement(pom.getHomepage().getPassword(), password);

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

		clickonelement(pom.getBookhotel().getLastname());
		String lastname = File_Reader_Manager.filereadermanager().configurationreader().getlastname();
		inputelement(pom.getBookhotel().getLastname(), lastname);

		clickonelement(pom.getBookhotel().getAddress());
		String particulardata5 = Particulardata(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1, 17, 5);
		inputelement(pom.getBookhotel().getAddress(), particulardata5);

		clickonelement(pom.getBookhotel().getCcvnum());
		String cardnumber = File_Reader_Manager.filereadermanager().configurationreader().getcardnumber();
		inputelement(pom.getBookhotel().getCcvnum(), cardnumber);

		dropdown(pom.getBookhotel().getCcvtype(), "index", "2");

		dropdown(pom.getBookhotel().getCcvmonth(), "index", "11");
		dropdown(pom.getBookhotel().getCcvyear(), "index", "5");

		clickonelement(pom.getBookhotel().getCcv());
		String ccv = File_Reader_Manager.filereadermanager().configurationreader().getccv();
		inputelement(pom.getBookhotel().getCcv(), ccv);

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

	@Test(enabled = false)
	private void hotel() throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager.filereadermanager().configurationreader().geturl();
		url(url, "get");
		log.info("Session created");
		wait(4000);

		String driver1 = driver1(url);
		System.out.println(driver1);
		String driver12 = driver1("title");
		System.out.println(driver12);

		clickonelement(pom.getHomepage().getUsername());
		//String particulardata = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx",1,3,5);
		//inputelement(pom.getHomepage().getUsername(), particulardata);
		String username = File_Reader_Manager.filereadermanager().configurationreader().getusername();
	inputelement(pom.getHomepage().getUsername(), username);

		clickonelement(pom.getHomepage().getPassword());
		//String particulardata2 = Particulardata("C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1,4,5);
		//inputelement(pom.getHomepage().getPassword(), particulardata2);
		String password = File_Reader_Manager.filereadermanager().configurationreader().getpassword();
		inputelement(pom.getHomepage().getPassword(), password);

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

		clickonelement(pom.getBookhotel().getLastname());
		String lastname = File_Reader_Manager.filereadermanager().configurationreader().getlastname();
		inputelement(pom.getBookhotel().getLastname(), lastname);

		clickonelement(pom.getBookhotel().getAddress());
		String particulardata5 = Particulardata(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1, 17, 5);
		inputelement(pom.getBookhotel().getAddress(), particulardata5);

		clickonelement(pom.getBookhotel().getCcvnum());
		String cardnumber = File_Reader_Manager.filereadermanager().configurationreader().getcardnumber();
		inputelement(pom.getBookhotel().getCcvnum(), cardnumber);

		dropdown(pom.getBookhotel().getCcvtype(), "index", "2");

		dropdown(pom.getBookhotel().getCcvmonth(), "index", "11");
		dropdown(pom.getBookhotel().getCcvyear(), "index", "5");

		clickonelement(pom.getBookhotel().getCcv());
		String ccv = File_Reader_Manager.filereadermanager().configurationreader().getccv();
		inputelement(pom.getBookhotel().getCcv(), ccv);

		clickonelement(pom.getBookhotel().getBooknow());

		Thread.sleep(10000);
		wait(10);

		wait(50);

		clickonelement(pom.getBookingconfm().getItinerary());
		log.fatal("Sucessfully booked the hotel");

		Thread.sleep(5000);
		wait(5);
		screenshot("Runner_class0");

		Thread.sleep(5000);

		clickonelement(pom.getLogout().getLogout());
		wait(20);
		screenshot("Runner_Class21");
	}
	
	@Test(groups = "hotel", invocationCount = 2)
	private void hotelbooking2() throws Throwable {
		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager.filereadermanager().configurationreader().geturl();
		url(url, "get");
		log.info("Session created");
		wait(4000);

		String driver1 = driver1(url);
		System.out.println(driver1);

		String driver12 = driver1("title");
		System.out.println(driver12);

		clickonelement(pom.getHomepage().getUsername());
		String username = File_Reader_Manager.filereadermanager().configurationreader().getusername();
		inputelement(pom.getHomepage().getUsername(), username);

		clickonelement(pom.getHomepage().getPassword());
		String password = File_Reader_Manager.filereadermanager().configurationreader().getpassword();
		inputelement(pom.getHomepage().getPassword(), password);

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

		dropdown(pom.getSearchhotel().getAdultroom(), "index", "2");
		wait(20);

		dropdown(pom.getSearchhotel().getChildroom(), "index", "2");
		wait(20);

		clickonelement(pom.getSearchhotel().getSubmit());

		clickonelement(pom.getSelecthotel().getRadiobutton());

		clickonelement(pom.getSelecthotel().getContinue1());

		wait(20);

		clickonelement(pom.getBookhotel().getFirstname());
		String firstname = File_Reader_Manager.filereadermanager().configurationreader().getfirstname();
		inputelement(pom.getBookhotel().getFirstname(), firstname);

		clickonelement(pom.getBookhotel().getLastname());
		String lastname = File_Reader_Manager.filereadermanager().configurationreader().getlastname();
		inputelement(pom.getBookhotel().getLastname(), lastname);

		clickonelement(pom.getBookhotel().getAddress());
		String particulardata5 = Particulardata(
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Mini_Project_Mvn\\testcases.xlsx", 1, 17, 5);
		inputelement(pom.getBookhotel().getAddress(), particulardata5);

		clickonelement(pom.getBookhotel().getCcvnum());
		String cardnumber = File_Reader_Manager.filereadermanager().configurationreader().getcardnumber();
		inputelement(pom.getBookhotel().getCcvnum(), cardnumber);

		dropdown(pom.getBookhotel().getCcvtype(), "index", "2");

		dropdown(pom.getBookhotel().getCcvmonth(), "index", "11");
		dropdown(pom.getBookhotel().getCcvyear(), "index", "5");

		clickonelement(pom.getBookhotel().getCcv());
		String ccv = File_Reader_Manager.filereadermanager().configurationreader().getccv();
		inputelement(pom.getBookhotel().getCcv(), ccv);

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
	}

}
