package com.inetbanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String uname, String pwd) {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		System.out.println("uname:" + uname);
		System.out.println("pword:" + pwd);
		driver.get(baseurl1);
		LoginPage lp = new LoginPage(driver);
		lp.setusername(uname);
		logger.info("username set successfully");
		lp.setpassword(pwd);
		lp.LoginButton();
		logger.info("Login button clicked successfully");
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions
				.titleContains("Guru99 Bank Manager HomePage"));
		String s = driver.getTitle();
		System.out.println(s);
		

	}

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {

		String path = "C:\\Users\\sourish\\git\\FrameworkTest\\InetBankingV2\\src\\test\\java\\com\\inetbanking\\testData\\test.xlsx";
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colnum = XLUtils.getCellCount(path, "sheet1", 1);

		String[][] logindata = new String[rownum][colnum];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;

	}
	
}
