
public class StringRotation {
	public static void strrotate(String s,String r){
		char[] a=s.toCharArray();
		String strrot="";
		if(s.length()!=r.length())
			System.out.println("False");
		else{
			strrot=strrot+s.charAt(a.length-1);
		for(int i=0;i<a.length-1;i++){
			strrot=strrot+s.charAt(i);
		}System.out.println(strrot);
		}
		if(r.equals(strrot))
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static String strrot(String st,String rt){
		String concat=st+st;
		String value="";
		if(concat.indexOf(rt)!=-1)
			
		value="true";
		else
			value="false";
		return value;
	}
	public static void main(String[] args){
		String str="XYZ";
		String str1="YXZ";
		  strrotate(str,str1);
		  String t=strrot(str,str1);
		  System.out.println(t);
	}

}
