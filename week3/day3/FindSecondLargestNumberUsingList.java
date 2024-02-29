package week3.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.iterators.ArrayIterator;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		int[] num = {3, 2, 11, 4, 6, 7};
		
		List<Integer> number=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			number.add(num[i]);
			
		}
		Collections.sort(number);
		System.out.println(number);
		int a=number.size();
		System.out.println(a);
		Integer integer = number.get(4);
		
		System.out.println("The Second largest number is "+ integer);
	}

}
