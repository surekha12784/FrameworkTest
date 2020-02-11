import java.util.HashMap;


public class Repetativewords {
	
	public static void Repetativewordscount(String rep){
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String[] words=rep.split(" ");
		for(String word: words){
			if(hm.containsKey(word)){
				hm.put(word.toLowerCase(),hm.get(word)+1);
			}else
				hm.put(word.toLowerCase(), 1);
			
			
			
		}System.out.println(hm);
		
	}
	
	
	
	public static void main(String[] args){
		
		Repetativewordscount("My name is name have name");
		
	}

}
