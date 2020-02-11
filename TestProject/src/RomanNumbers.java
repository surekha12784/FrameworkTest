import java.util.HashMap;

public class RomanNumbers {

	public static void romannumbercon(String str) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		int sum = 0;
		char[] arr1 = new char[str.length()];
		arr1 = str.toCharArray();

		for (int i = arr1.length - 1; i >= 0; i--) {

			if (i == arr1.length - 1) {
				
				sum = sum + hm.get(arr1[i]);
			} else {

				if (hm.get(arr1[i+1]) <= hm.get(arr1[i])) {
					sum = sum + hm.get(arr1[i]);
				} else 

					sum = sum - hm.get(arr1[i]);
				
			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		romannumbercon("XIV");

	}

}
