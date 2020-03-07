package RestAssured;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class getDataarray {
    @Test
	public void test(){
	Response r=RestAssured.given()
                              .get("http://dummy.restapiexample.com/api/v1/employees");

	 String s=r.jsonPath().prettify();
	 System.out.println(s);
	 
	      List<String> list1=r.getBody().jsonPath().getList("data.id");
	      for(String i:list1)
	    	  System.out.println(i);
	    
	      
	      
	}
}
