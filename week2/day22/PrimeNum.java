package week2.day22;

import java.util.Iterator;

public class PrimeNum {

	public static void main(String[] args) {
		int num= 13;
		for(int i=2;i<=num/2; i++) {
			if(num%i==0)
				System.out.println("the given number is not a prime number");
			else
				System.out.println("the give number is prime number ");
			break;
		}
		
	}

}
