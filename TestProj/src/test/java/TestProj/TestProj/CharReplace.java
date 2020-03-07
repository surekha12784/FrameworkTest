package TestProj.TestProj;

public class CharReplace {
	static char[] ch; 
	public static void charreplacement(String s){
		s=s.toLowerCase();
		String s1="";
		ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='t')
				ch[i]='d';
		}
		for(int i=0;i<ch.length;i++)
			s1=s1+ch[i];
		
		System.out.println(s1);
		
	}
	public static void charinbuildfun(String s){
		String p=s.replace('T', 'd');
		
		System.out.println(p);
		
	}
	public static void charStringbuilderfun(String s){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		sb.append(ch[i]);
	  System.out.println(sb);	
	}
		
		
	
	
	
	public static void main(String[] args){
		String str="TestEngineer";
		charreplacement(str);
		charinbuildfun(str);
		charStringbuilderfun(str);
	}
}
