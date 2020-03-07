import java.util.ArrayList;


public class RepWordsInString {
	
	public static void test(String st){
		ArrayList<String> al=new ArrayList<String>();
		String[] a=new String[10];
	    a=st.split(" ");
	    for(int i=0;i<a.length;i++){
	    	
	    	 for(int j=i+1;j<a.length;j++){
	    		 if(a[i]==a[j])
	    			 if(!al.contains(a[i]))
	    			 al.add(a[i]);
	    		 
	    	 }
	    	
	    }
		
		
		
	}
	
	
	
	public static void main(String[] args){
		String str="my na my surekha na my";
		test(str);
	}

}
