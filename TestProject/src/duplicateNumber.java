import java.util.HashMap;


public class duplicateNumber {
	
	public static void test(int[] a){
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i]))
				hm.put(a[i], hm.get(a[i])+1);
			else
				hm.put(a[i], 1);
						System.out.println(hm);
			
		}
		
	}
	
	public static void main(String[] args){
		int[] a={2,4,3,5,2};
		test(a);
		
	}

}
