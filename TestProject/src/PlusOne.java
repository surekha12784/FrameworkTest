import java.math.BigDecimal;
import java.math.BigInteger;

public class PlusOne {
	public int[] plusOne(int[] digits) {
	int carry = 1;
	System.out.println("diglen"+digits.length);
    for (int i = digits.length-1; i>= 0; i--) {
    	
        digits[i] += carry;
        System.out.println("i:="+i+"digits[i]:"+digits[i]);
        if (digits[i] <= 9){ 
        	     	// early return 
        	System.out.println("dig"+digits[i]);
            return digits;
        }
        digits[i] = 0;
        System.out.println("diglast"+digits[i]);
    }
    int[] ret = new int[digits.length+1];
    System.out.println("return diglen"+digits.length+1);
    ret[0] = 1;
    return ret;

}
	public static void main(String[] args) {

		int[] arr = new int[] {1,0,8,9};
		int[] arr2;

		PlusOne po = new PlusOne();
		arr2 = po.plusOne(arr);
		for (int a : arr2)
			System.out.println("a value:" + a);

	}

}
