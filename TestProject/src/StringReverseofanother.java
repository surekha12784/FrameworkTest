
public class StringReverseofanother {
	//need to check this program one more time
	public static void srofanother(String s1,String s2){
		String s3=s2+s2;
		System.out.println(s3);
		if(s3.contains(s1)){
			System.out.println("reverseof another");
		}else
			System.out.println("not reverse");
	}
	
	public static void main(String[] args){
		String st1="surekha";
		String st2="ahkerus";
		srofanother(st1,st2);
	}

}
