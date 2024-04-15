package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {
	

	public static void main(String[] args) {

		int[] a = { 101, 90, 20, 30, 40 };
		int[] b = { 40, 98, 60, 70 };

		int a_length = a.length;
		int b_length = b.length;
		int c_length = a_length + b_length;

		int[] c = new int[c_length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a_length + i] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			//Arrays.sort(c);
			System.out.print(c[i] + " ");
		

		}
	
		for(int i=1; i<c.length; i++) {
			for(int j=0; j<c.length; j++) {
				if(c[i]<c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
