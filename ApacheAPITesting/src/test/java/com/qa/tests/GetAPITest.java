package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;







import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





import com.qa.Util.TestUtil;
import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
	TestBase testBase;
	String serviceurl,apiUrl,url;
	RestClient restClient;
	CloseableHttpResponse httpResponse;
	//automate rest get call using http client -rest api automation part3
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		
		testBase=new TestBase();
		serviceurl=p.getProperty("URL");
		 apiUrl=p.getProperty("serviceURL");
		url=serviceurl+apiUrl;
		
	}
	@Test
	public void getTest() throws ClientProtocolException, IOException{
		restClient=new RestClient();
		 httpResponse=restClient.get(url);
		//status code
		int statuscode=httpResponse.getStatusLine().getStatusCode();
		System.out.println("statuscode:"+statuscode);
		Assert.assertEquals(statuscode, 200,"status code is not 200");
		
		
		//json string
		String responsestr=EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
		JSONObject responsejson=new JSONObject(responsestr);
		System.out.println("responsejson"+responsejson);
		String s=TestUtil.getValueByJPath(responsejson,"/per_page");
		System.out.println("s:"+s);
		//all headers
		Header[] headerarray=httpResponse.getAllHeaders();
		HashMap<String,String> allheader=new HashMap<String,String>();
		for(Header header:headerarray){
			allheader.put(header.getName(), header.getValue());
				}
		System.out.println("Headerarray"+allheader);
	}
	

}
