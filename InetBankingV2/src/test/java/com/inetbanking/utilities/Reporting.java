
package com.inetbanking.utilities;

import java.io.File;






import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentTest;


public class Reporting extends TestListenerAdapter implements ITestListener{
    WebDriver driver;
	String repName="Test-Report.html";
	public ExtentTest logger;
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
		
		//String screenshotpath="./Screenshots/"+arg0.getName()+".png";
		//File f=new File(screenshotpath);
		System.out.println("file created successfully");
		System.out.println(arg0.getName());
		
		
			try{
				System.out.println("in file");
				File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   // File dest = new File(screenshotpath);
			   // if(dest.exists()){
			    	System.out.println("hello");
			    FileUtils.copyFile(scr, new File("./Screenshots/"+System.currentTimeMillis()+".png"));
			   // }
				//logger.fail("screenshot is below"+logger.addScreenCaptureFromPath(screenshotpath));
				
			}catch(Exception e){
				
			
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test case successfully passed");
		
	}

}
