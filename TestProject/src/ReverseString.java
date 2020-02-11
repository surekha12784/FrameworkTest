
public class ReverseString {
	static String rev="";
	public static void revstring(String str){
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
			
		} System.out.println("reversestringis:"+rev);
		
	}
	
	public static void main(String[] args){
		revstring("Mynameissurekha");
		
	}
	

}
