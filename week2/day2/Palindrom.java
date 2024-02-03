package week2.day22;

public class Palindrom {

	public static void main(String[] args) {
		int num=34343;
		int num1=num;
		int result=0;
		
		while (num!=0) {
			result=(result * 10) + num % 10;
			num=num/10;
			
			
		}
		if(num1==result) {
			System.out.println("it is a Palindrome number");
		}
		else {
			System.out.println("it is not a palindrom number");
		}

	}

}
