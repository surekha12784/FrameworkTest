package RestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Payloadasobj {
	
	public static void main(String[] args) throws JsonProcessingException{
		PlainJavatest test=new PlainJavatest("test1");
		plainjavatest2 p=new plainjavatest2("surekha",test);
		fields f=new fields(p);
		ObjectMapper om=new ObjectMapper();
		String mydata=om.writerWithDefaultPrettyPrinter().writeValueAsString(f);
		System.out.println(mydata);
		
		
		
		
		
		
	}

}
