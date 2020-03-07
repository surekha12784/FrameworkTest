public class factorialofnumberrec {
	static int fact = 1;

	public int test(int n) {

		fact = fact * n;

		int t = n - 1;
		if (t > 1) {
			test(t);
		}

		return fact;
	}

	public static void main(String[] args) {
		int num = 5;
		factorialofnumberrec a=new factorialofnumberrec();
		int t = a.test(num);
		System.out.println(t);
	}

}
