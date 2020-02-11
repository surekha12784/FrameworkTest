
public class Substrings {
	
	public static void substring1(String str){
		String[] arr1 =new String[30];
		int count=0;
		for(int i=0;i<=str.length();i++){
			for(int j=i+1;j<=str.length();j++){
		
		arr1[count]=str.substring(i, j);
		count=count+1;
		System.out.println(str.substring(i, j));
	}}}
	
	
	public static void main(String[] args){
		
		
		
		substring1("surekha");
		
	}

}
