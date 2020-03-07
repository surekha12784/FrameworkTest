import java.util.ArrayList;
import java.util.List;


public class Sumofthreedigits {
	public static void test(Integer[] a2){
		int[][] arr=new int[3][3];
		int first=0,second=0;
		//List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<a2.length;i++){
			for(int j=i+1;j<a2.length;j++){
				for(int k=i+2;k<a2.length;k++){
					if(a2[i]+a2[j]+a2[k]==0){
						System.out.println("i:="+i+"j:="+j+"k:="+k);
						System.out.println("a2[i]:="+a2[i]+"a2[j]:="+a2[j]+"a2[k]:="+a2[k]);
						arr[first][second]=a2[i];
		                arr[first][second+1]=a2[j];
						arr[first][second+2]=a2[k];
							first=first+1;second=0;}
				}
			}
		} for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	public static void main(String[] args){
		Integer[] a={1,1,1,-2,-1,0};
		test(a);
	}

}
