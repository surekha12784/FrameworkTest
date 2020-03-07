import java.util.ArrayList;
import java.util.List;


public class ListTest {
	
	public static void test(){
		List<String> list1=new ArrayList<String>();
		list1.add("hi");
		list1.add("hello");
		list1.add("surekha");
		for(String s:list1){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args){
		 test();
	}

}
