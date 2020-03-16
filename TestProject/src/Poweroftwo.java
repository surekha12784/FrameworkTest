
public class Poweroftwo {
	 boolean t;
   public boolean isPowerOfTwo(int n) {
	  
	 n=n&(n-1);
	 System.out.println("n:="+n);
	   return true;
	    
	}
   
public static void main(String[] args){
	   int a=16;
	   
	   Poweroftwo i=new Poweroftwo();
	   boolean b=i.isPowerOfTwo(a);
	   System.out.println(b);
	   
   }

}
