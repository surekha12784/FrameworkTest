import java.util.Arrays;


public class Anagram {
	
	public static void anagramtest(String s1,String s2){
		System.out.println("hello");
		  s1=s1.replaceAll("\\s","");
		  s2=s2.replaceAll("\\s","");
		  s1=s1.toLowerCase();
		  s2=s2.toLowerCase();
		  System.out.println(s1);
		  System.out.println(s2);
		  if(s1.length()==s2.length()){
			  char[] Arr=s1.toCharArray();
			  char[] arr2=s2.toCharArray();
		
			    Arrays.sort(Arr);
			    Arrays.sort(arr2);
			    System.out.println(Arr);
			    System.out.println(arr2);
			    if(Arrays.equals(Arr, arr2)){
			    	System.out.println("both are anagrams");
			    }else
			    	System.out.println("both are not anagrams");
			    	
			    	
		  }else
			  System.out.println("both are not anagrams");
		
	}
	
	
	public static void main(String[] args){
		String str1="sil ent";
		String str2="Lis  ten";
		anagramtest(str1,str2);
	}

}
