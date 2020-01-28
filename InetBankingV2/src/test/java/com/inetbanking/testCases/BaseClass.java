package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
    
	ReadConfig readconfig=new ReadConfig();
	
	public String baseurl1=readconfig.getbaseurl();
	public String username1 =readconfig.getusername1();
	public String password1 = readconfig.getpassword1();
	public static WebDriver driver;
    static public Logger logger;
	@Parameters(value="browser")
	@BeforeClass
	public void setUp(String browser) {
		
        if(browser.equals("chrome")){     
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sourish\\workspace\\InetBankingV2\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
        }
        else if(browser.equals("ie")){
        	
        	System.setProperty("webdriver.ie.driver",
        			"C:\\Users\\sourish\\git\\FrameworkTest\\InetBankingV2\\Drivers\\IEDriverServer.exe");
        	driver=new InternetExplorerDriver();
        	//WebDriverWait w=new WebDriverWait(driver,20);
        	//w.until(ExpectedConditions.titleContains(""))
        	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        	
        }
		logger=Logger.getLogger("IBanking");
	    PropertyConfigurator.configure("Log4j.properties");
	   
	   

	}
   @AfterClass
	public void TearDown() {

		driver.close();

	}

}
