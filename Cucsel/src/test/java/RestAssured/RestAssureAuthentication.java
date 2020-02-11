package RestAssured;



import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class RestAssureAuthentication {
	
	@Test
	public void test(){
		
		Response res=RestAssured.given()
				             .auth().preemptive()
				             .basic("ToolsQA", "TestPassword")
				             .when()
				             .get("http://restapi.demoqa.com/authentication/CheckForAuthentication");
		String code=res.getBody().jsonPath().prettify();
		System.out.println(code);
		
		 
		
		
	}

}
