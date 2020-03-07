package RestAssured;

import static org.testng.Assert.assertTrue;
import io.restassured.response.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pjar1final {
	public static void main(String[] args) throws JsonProcessingException{
		String[] test={"adm","editor","contributor"};
		PJar1 pj=new PJar1("admin",32,test);
		ObjectMapper om=new ObjectMapper();
		String t=om.writerWithDefaultPrettyPrinter().writeValueAsString(pj);
		System.out.println(t);
	    String s=String.valueOf(t.indexOf("name"));
	    System.out.println(s);
	    String k=String.valueOf(t.indexOf("editor"));
	    System.out.println(k);
	   
		

			
	}

}
