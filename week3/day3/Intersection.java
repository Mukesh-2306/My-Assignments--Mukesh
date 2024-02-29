package week3.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		
		int[] num = {3, 2, 11, 4, 6, 7};
		int[] num1 = {1, 2, 8, 4, 9, 7};
		

		List<Integer> number =new ArrayList<Integer>();
		
		List<Integer> number1 =new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			number.add(num[i]);
									
			}
		for (int j = 0; j < num1.length; j++) {
			
			number1.add(num1[j]);
							
			
		}
		for (int integer : number) {
			
			if(number1.contains(integer)){
			
			System.out.println(integer);
			
			Integer obj = new Integer(integer);
			
			number1.remove(obj);
			 
			 
			
			}
			
		}
		
		
		

	}

}
