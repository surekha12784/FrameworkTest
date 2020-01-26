package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String baseurl="http://demo.guru99.com/v4/";
	public String username1 = "mngr243303";
	public String password1 = "abYmEjY";
	static public WebDriver driver;
   
	
	@BeforeClass
	public void setUp() {
             
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sourish\\workspace\\InetBankingV2\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
	
	

	}
   @AfterClass
	public void TearDown() {

		driver.close();

	}

}
