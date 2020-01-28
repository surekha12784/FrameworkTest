package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		
		File src=new File("./Configuration/config.properties");
		
		try{
			FileInputStream fis=new FileInputStream(src);
			System.out.println("The File Input Stream is " + fis);
		pro=new Properties();
		pro.load(fis);
		System.out.println("Properties are "+ pro);}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
	}
	  public String getbaseurl(){
		  System.out.println("info"+pro.getProperty("baseurl1")); 
		 // String url1="http://demo.guru99.com/v4/index.php";
		String url1=pro.getProperty("baseurl1");
		System.out.println("Stringurl="+url1);
		 return url1;
		 }
	     public String getusername1(){
		  
			 String username1=pro.getProperty("username1");
			 return username1;
			 }
	     public String getpassword1(){
			  
			 String password1=pro.getProperty("password1");
			 return password1;
			 }
	     
		
	}

	


