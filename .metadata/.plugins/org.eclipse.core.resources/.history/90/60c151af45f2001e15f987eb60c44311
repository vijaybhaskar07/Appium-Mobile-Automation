package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		//Using + String concatenation operator
		String str = "DevonSoftware";
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseString = reverseString + str.charAt(i);
		}

		System.out.println("Reverse of a given String: " + reverseString);

		//2. String Buffer
		
		String str1 = "VijaySamyu";
		String reverse = new StringBuffer(str1).reverse().toString();
		System.out.println(reverse);
		
		//3. Using Character Array
		
		String s = "aiautomation";
		char a[] = s.toCharArray();
		int len = a.length;
		String rev = "";
		for(int i=len-1; i>=0; i--) {
			rev = rev+a[i];
		}
        System.out.println("Reverse of a given String: " +rev);
	}

}
