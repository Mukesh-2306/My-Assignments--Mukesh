package week2.day22;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,7,6,8};
		Arrays.sort(a);
		int n = a.length;
		int sum = 0;
		int sum1 = n * (n + 1) / 2;

		for (int i = 0; i < n-1; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum1 - sum);
	}

}
