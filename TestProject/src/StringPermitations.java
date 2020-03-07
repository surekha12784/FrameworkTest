
public class StringPermitations {
	public static void strperm(String input){
		strperm1("",input);
	}
	public static void strperm1(String permitation,String input){
		if(input.length()==0){
			System.out.println(permitation);
		}else{
			for(int i=0;i<input.length();i++){
				strperm1(permitation+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
			}
		}
			
	}
	
	
	public static void main(String[] args){
		String str="jar";
		strperm(str);
	}

}
