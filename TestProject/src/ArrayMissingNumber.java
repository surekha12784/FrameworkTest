import java.sql.Array;
import java.util.ArrayList;


public class ArrayMissingNumber {
	public static void test(Integer b[]){
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<b.length;i++){
					
				if(b[i]==b[i-1]+1)
					System.out.println("good");
				else{
					for(int j=b[i]-1;j>b[i-1];j--)
						al.add(j);
				}
			
	}System.out.println(al);
	}
	
	public static void main(String[] args){
		Integer[] a=new Integer[]{1,3,5,9,15};
		test(a);
		
	}

}
