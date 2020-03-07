import java.util.ArrayList;

public class PivotIndextest {

	public ArrayList<Integer> test(int a[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int pivot = 1;
		int lsum = 0, rsum = 0;
		while(pivot<a.length){
		for (int i = 0; i < pivot; i++) {
			System.out.println("i:"+i);
			lsum = lsum + a[i];
			System.out.println("lsum:"+lsum);}
			
			for(int j=a.length-1;j>pivot;j--){
				System.out.println("j:"+j);
				rsum = rsum + a[j];
				System.out.println("rsum:"+rsum);
			}
			if (lsum == rsum ){
				System.out.println("lsum:"+lsum);
				System.out.println("rsum:"+rsum);
				System.out.println("lsum=rsum+pivot:"+pivot);
				al.add(pivot);
				
				}
			
			else
				if(pivot==a.length-1){
					if(al.isEmpty())
					al.add(-1);
					break;
				}
					
				{pivot=pivot+1;lsum=0;rsum=0;}

		}

		return al;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,0,0,1,1,1};
		PivotIndextest p = new PivotIndextest();
		ArrayList<Integer> pi=new ArrayList<Integer>();
		pi= p.test(arr);
		System.out.println("pivot:="+pi);
	}

}
