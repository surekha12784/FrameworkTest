import java.util.ArrayList;


public class LargestPalindromeSubstring {
	
	public static void larpal(String str){
	    ArrayList<String> al=new ArrayList<String>();
	    ArrayList<String> pal=new ArrayList<String>();
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				al.add(str.substring(i, j));
			}
		}
		System.out.println(al);
		for(String s:al){
			char[] test=s.toCharArray();
			if(s.length()==1)
				pal.add(s);
			else{
				int last=s.length()-1;
			for(int c=0;c<(s.length()-1)/2;c++){
				
				if(test[c]==test[last]){
				
					  last--;
					if(c==(s.length()-1)/2-1)
				    pal.add(s);}
				else
					break;
			}
			
		}}System.out.println(pal);
		String substr="";
		int maxlen=0;
		for(String p:pal){
			
			//String substr="";
			
			if(p.length()>maxlen){
				maxlen=p.length();
				substr=p;
				
			}
		}System.out.println("largest substring"+substr);
		
	}
	
	
	
	public static void main(String[] args){
		String str="surerute";
		larpal(str);
		
	}

}
