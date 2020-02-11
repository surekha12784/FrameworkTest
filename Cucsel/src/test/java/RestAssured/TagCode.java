package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TagCode {
	
	public String tok;
	
	@Test
	public String testtag(){
		
		Response resp=RestAssured.given()
		           .formParam("client_id","MyTest")
		           .formParam("client_secret", "ac6b180d4960bd3395d29eb890b372a4")
		           .formParam("grant_type", "client_credentials")
		           .post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(resp.jsonPath().prettify());
		System.out.println(resp.jsonPath().get("access_token"));
		tok=resp.jsonPath().get("access_token");
		return tok;
		
	}

}
