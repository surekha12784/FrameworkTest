import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testSele {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourish\\Desktop\\QA\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
	   	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		
		String s=driver.getTitle();
		
		System.out.println(s);
	}

}
