package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void LoginTest1() {

		driver.get(baseurl);
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username1);
		lp.setpassword(password1);
		lp.LoginButton();
		WebDriverWait w = new WebDriverWait(driver, 25);

		w.until(ExpectedConditions
				.titleContains("Guru99 Bank Manager HomePage"));
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		String title = driver.getTitle();

		System.out.println("Title:=" + title);

		Assert.assertTrue(title.equals("Guru99 Bank Manager HomePage"));

	}

}
