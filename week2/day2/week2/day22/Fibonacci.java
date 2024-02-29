package week2.day22;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8, firstNum=0, secNum=1;
		for (int i = 1; i < range; i++) {
			int sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum + " ");
			
			
		}
		


	}

}
