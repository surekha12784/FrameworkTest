package RestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojoarrayfinal1 {
	
	public static void main(String[] args) throws JsonProcessingException{
		Pojoarray1 p1=new Pojoarray1("admin");
		Pojoarray2 p2=new Pojoarray2(32);
		String[] ar={"admin","editor","contributor"};
		Pojoarray3 p3=new Pojoarray3(ar);
		Pojoarrayfinal paf=new Pojoarrayfinal(p1,p2,p3);
		ObjectMapper om=new ObjectMapper();
		String s=om.writerWithDefaultPrettyPrinter().writeValueAsString(paf);
		System.out.println(s);
		
	}

}
