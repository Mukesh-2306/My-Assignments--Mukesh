package week1.day2;

public class LearnOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		System.out.println("add:"+a+b);
		System.out.println(a-b);
		System.out.println("multi:"+a*b);
		System.out.println("div:"+a/b);
		System.out.println("remainder:"+a%b);
		//Assignment operators
		int result=100;
		//Assignment operators
		a=a+5;
		System.out.println(a);
		a+=5;
		System.out.println(a);
		// comprasion operators:
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		//logical operators:
		System.out.println((a==b)&&(a>=b));
		System.out.println((a!=b)&&(a!=b));
		System.out.println((a!=b)||(a==b));
		System.out.println((a==b)||(a==b));
		// not operators
		boolean flag=true;
		System.out.println(!flag);
		//increment operator
		int i=4;
		System.out.println(i++);// post increment
		System.out.println(i);
		System.out.println(++i);//pre increment 
		//decrement operator
		System.out.println(i--);// post decrement
		System.out.println(i);
		System.out.println(--i);// pre decrement
		
		
		
		
		

	}

}
