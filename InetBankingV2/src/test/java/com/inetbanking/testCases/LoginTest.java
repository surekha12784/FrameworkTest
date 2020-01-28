package com.inetbanking.testCases;




import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void LoginTest1() {

		driver.get(baseurl1);
		LoginPage lp = new LoginPage(driver);
			
		logger.info("entered url");
		lp.setusername(username1);
		logger.info("entered username");
		lp.setpassword(password1);
		logger.info("entered password");
		lp.LoginButton();
		logger.info("Login button clicked successfully");
		WebDriverWait w = new WebDriverWait(driver, 25);

		w.until(ExpectedConditions
				.titleContains("Guru99 Bank Manager HomePage"));
		

		String title = driver.getTitle();
		

		System.out.println("Title:=" + title);

		Assert.assertTrue(title.equals("Guru99 Bank Manager HomePage"));
		
		logger.info("our assertion successfully passed");

	}

}
