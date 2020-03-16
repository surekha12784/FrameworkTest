package com.qa.base;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
//Geson,apache,jaxb,jaxon
 
public class test1 {
	
	public static void httpgettest(String ur) throws ClientProtocolException, IOException{
		
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(ur);
		HttpResponse resp=client.execute(request);
		System.out.println(resp);
				
		  
	  }
	public static void main(String[] args) throws ClientProtocolException, IOException{
		String url="https://samples.openweathermap.org/data/2.5/weather?zip=94555,us&appid=b6907d289e10d714a6e88b30761fae22";
		httpgettest(url);
	}
}

