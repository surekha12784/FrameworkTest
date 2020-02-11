package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class GetData {
	
	public void testResponse(){
		
	Response res=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?zip=94555,us&appid=b6907d289e10d714a6e88b30761fae22");
		int code=res.getStatusCode();
		String s=res.asString();
		System.out.println(res.getCookies());
		System.out.println("status code:"+s);
		Assert.assertEquals(code, 200);
	
	}

}
