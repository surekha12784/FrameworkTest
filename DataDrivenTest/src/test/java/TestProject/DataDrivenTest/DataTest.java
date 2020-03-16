package TestProject.DataDrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataTest {
	
	WebDriver driver;
		@Test
	public void test(){
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sourish\\Desktop\\exceldata.xls");		
	driver=new ChromeDriver();
		}
	
	public static void main(String[] args){
		DataTest t=new DataTest();
		t.test();
		
	}

}
