package week3.day2;

import java.util.Iterator;

public class ReverseOddWords {

	public static void main(String[] args) {
		String text=new String("I am a software tester");
		
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
				if(i%2 !=0) {
				
				char[] ca = split[i].toCharArray();
				
				for (int j = ca.length-1; j>=0; j--) {
					System.out.print(ca[j] +"");
					
				}
				
			}
			else 
			{
				System.out.print(" ");
				System.out.print(split[i] +" ");
			}
		}

	}

}
