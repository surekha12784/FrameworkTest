
public class AddingNumbers {
	 int sum=0;
	public void addNumbers(int x,int y){
		
		if(y==0)
			System.out.println(x);
		else
			sum=x^y;
		int carry=(x&y)<<1;
		System.out.println(""
				+ "sum is:"+sum+"carry is:"+carry);
		
			
	}
	
	public static void main(String[] args){
		int a=2;
		
		int b=3;
		AddingNumbers ad=new AddingNumbers();
		ad.addNumbers(a,b);
	}

}
