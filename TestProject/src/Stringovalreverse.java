public class Stringovalreverse {
	public static void test(String s){
		char[] c=s.toCharArray();
		 int k=c.length-1;
		 
		for(int i=0;i<k;i++){
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
			for(int j=k;j>i;j--){
				if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'){
				  char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					k=j-1;
					break;
				}
			}}for(char p:c)
			System.out.println(p);}
	}
	public static void main(String[] args){
		String str="suabecoi";
			test(str);	
		
	}

}
