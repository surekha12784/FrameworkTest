package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

public class RestAssuredDemo {
	
	@Test
     public void test(){
		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
		RequestSpecification req=RestAssured.given();
		Response res=req.queryParam("zip", "94555,us")
		    .queryParam("appid", "b6907d289e10d714a6e88b30761fae22")
		    .get("/weather");
		System.out.println(res.getStatusCode());
		
	}  

}
