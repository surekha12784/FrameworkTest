
package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Oauth2tokentest extends TagCode {

	@Test
	public void oauthtest(){
		TagCode tg=new TagCode();
		String k=tg.testtag();
	    Response res= RestAssured.given()
	                          .auth().oauth2(k)
	                          .post("http://coop.apps.symfonycasts.com/api/737/chickens-feed");
	    System.out.println("statuscode:"+res.getStatusCode());
	    System.out.println("body:"+res.jsonPath().prettify());
	               
	}
	
}
