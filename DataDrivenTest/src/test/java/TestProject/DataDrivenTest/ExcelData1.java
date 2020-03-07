package TestProject.DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelData1 {
	WebDriver driver;
	@Test(dataProvider="mydata1")
	public static void test(String uname,String pword){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sourish\\Desktop\\QA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.id("Login")).click();
		driver.close();
	}
	@DataProvider(name="mydata1")
	public static String[][] test1() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sourish\\Desktop\\exceldata.xls");
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet= workbook.getSheet("TestSheet");
		   int rowscount=sheet.getLastRowNum();
		   int colcount=sheet.getRow(0).getLastCellNum();
		   String[][] arr=new String[rowscount][colcount];
		   for(int i=1;i<=rowscount;i++){
			   for(int j=0;j<colcount;j++){
				   arr[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				   System.out.println(arr[i-1][j]);
			   }
		   }
		   
	  workbook.close();
		 
		  return arr;
		
		
	}
	public static void main(String[] args) throws IOException{
		
		test1();
		
		
		
		
	}

}
