package week2.day2;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.Length;

public class LearnArry {

	public static void main(String[] args) {
		//literate
		int[] num = {1,4,3,2,5,7,8};
		String[] muk = {"gdsg","sdgsdg","sdgsgdd","sdgdsgsdg"};
		//instantiation
		int[] numbers = new int[3];
		numbers[0]=8;
		numbers[1]=9;
		numbers[2]=7;
		//length of the array 
		System.out.println(num.length);
		
		int abc = num.length;
		int abc1 = muk.length;
		int abc2 = numbers.length;
		//print array
		for (int i = 0; i < abc; i++) {
			System.out.println(num[i]);
			
		}
		for (int i = 0; i < abc1; i++) {
			System.out.println(muk[i]);
			
		}
		for (int i = 0; i < abc2; i++) {
			System.out.println(numbers[i]);
			
		}
		//print the last value of the array
		
		System.out.println(muk[muk.length-1]);
		
		// sorting the array 
		
		Arrays.sort(num);
		
		for (int i = 0; i < abc; i++) {
			System.out.println(num[i]);
			
		}
				
		System.out.println(num[abc-2]);
		System.out.println(numbers[0]);
		System.out.println(muk[abc1-1]);

	}

}
