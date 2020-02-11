
public class Numberofwords {
	
	public static void wordcount(String str){
		
		String[] words=str.split(" ");
		System.out.println("words count in the string is:"+words.length);
		
		
	}
	
	public static void main(String[] args){
		
		wordcount("hello my name is surekha hi mate");
		
	}

}
