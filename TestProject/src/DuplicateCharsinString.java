import java.util.HashMap;
import java.util.Map;


public class DuplicateCharsinString {
	public static void duplicatechars(String str){
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(str.charAt(i))){
			
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else
				hm.put(str.charAt(i), 1);
			
		}
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet()){
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
		
		
	}
	
	
	public static void main(String[] args){
		duplicatechars("Mynameissurekha");
	}

}
