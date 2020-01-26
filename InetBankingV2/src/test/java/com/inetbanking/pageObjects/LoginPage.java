package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(name = "uid")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pword;

	@FindBy(name = "btnLogin")
	WebElement LoginButton1;

	public void setusername(String usname) {

		uname.sendKeys(usname);

	}

	public void setpassword(String psword) {

		pword.sendKeys(psword);

	}

	public void LoginButton() {

		LoginButton1.click();
	}

}
