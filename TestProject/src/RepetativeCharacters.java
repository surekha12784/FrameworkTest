import java.util.HashMap;


public class RepetativeCharacters {
	
	public static void repeatChars(String str){
		str=str.toLowerCase();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else
				hm.put(str.charAt(i), 1);
			
		}System.out.println(hm);
		
		
		
	}
	public static void main(String[] args){
		repeatChars("Mynameissurenama");
	}

}
