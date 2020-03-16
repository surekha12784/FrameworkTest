package TestProject.ApacheAPITesting;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class test3 {
	
	@Test
	public void getTest() throws ClientProtocolException, IOException{
		System.out.println("we are in get module");
		String str="https://samples.openweathermap.org/data/2.5/weather?zip=94555,us&appid=b6907d289e10d714a6e88b30761fae22";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet req=new HttpGet(str);
		HttpResponse res=client.execute(req);
		System.out.println(res.getStatusLine());
		System.out.println(res);
	}
	
	@Test
	public void putTest() throws ClientProtocolException, IOException{
		System.out.println("we are in post module");
		String st="http://dummy.restapiexample.com/api/v1/create";
		String pl="{\r\n"
				+ "\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
	 HttpClient client=HttpClientBuilder.create().build();
	  HttpPost req=new HttpPost(st);
	  StringEntity strent=new StringEntity(pl);
	  req.setEntity(strent);
	  HttpResponse res=client.execute(req);
	  System.out.println(res);

}
	@Test
	public void DeleTest() throws ClientProtocolException, IOException{
		String s="http://dummy.restapiexample.com/api/v1/delete/1/";
		System.out.println("We are in delete module");
		HttpClient client=HttpClientBuilder.create().build();
		HttpDelete req=new HttpDelete(s);
		HttpResponse res=client.execute(req);
		System.out.println(res);
		
	}
   /*@DataProvider(name="mydata")
   public int[][] mytest(){
	   
	
	   
   }*/
	


}


