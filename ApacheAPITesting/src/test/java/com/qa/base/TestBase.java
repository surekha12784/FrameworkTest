package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {
	public Properties p;
	
	public TestBase(){
		
		try{
		    p=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\sourish\\git\\FrameworkTest\\ApacheAPITesting\\src\\test\\java\\com\\qa\\config\\config.properties");
		    p.load(fis);
		 
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
