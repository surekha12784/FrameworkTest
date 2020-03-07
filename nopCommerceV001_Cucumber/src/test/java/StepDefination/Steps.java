package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.java.en.*;

public class Steps {
	
	public WebDriver driver;
	
	public LoginPage lp;
	
	
	@Given("User Launch chrome browser")
	public void user_Launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sourish\\workspace\\InetBankingV2\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	   
	}
	
	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_Email_as_and_password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		lp.clickLogin();
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title1) throws InterruptedException {
		
		if(driver.getTitle().contains(title1))
			System.out.println("Login Successful");
		else
			System.out.println("Login unsuccessful");
		Thread.sleep(2000);
	   
	}

	@When("User click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(2000);
	    
	}
   
	@Then("Close browser")
	public void close_browser() {
	 driver.close();
	}


}
