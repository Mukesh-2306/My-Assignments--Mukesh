package week2.day22;

import java.util.Arrays;

public class intersection {

	public static void main(String[] args) {
		int[] array1 ={3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int len1 = array1.length;
		int len2 = array2.length;
		
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				
				if(array1[i]==array2[j]) {
					
					System.out.println("the intersection number is: " +array1[i]);
				}
				
				
			}
			
		}
		
		
		

	}

}
