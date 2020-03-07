
public class SwapChars {
	
	public static void test(String s){
		String str1="";
		char first,last,temp;
		String[] words=s.split(" ");
	     for(int i=0;i<words.length;i++){
	    	 
	    	char[] swapchar=words[i].toCharArray();
			first=words[i].charAt(0);
			 last=words[i].charAt(words[i].length()-1);
			 swapchar[0]=last;
			 swapchar[words[i].length()-1]=first;
			 for(int j=0;j<swapchar.length;j++)
			  str1=str1+swapchar[j];
			   str1=str1+" ";
			   
		}System.out.println(str1);
		}
	
	
	public static void main(String[] args){
		
		String str="java code is very easy";
		 test(str);
	}

}
