package week3.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] num ={1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> nums=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++) {


			nums.add(num[i]);
			
		}
		//storing array value into list and print 
		//System.out.println(nums);
		
		//make the list in ascending order 
		Collections.sort(nums);
		//print the ascending order list
		//System.out.println(nums);
		
		for (int i = 0; i < nums.size()-1; i++) {
			
			if(nums.get(i)+1!=nums.get(i+1)) {
				System.out.println(nums.get(i)+1);
				
			}
			
			
		}
		
	}

}
