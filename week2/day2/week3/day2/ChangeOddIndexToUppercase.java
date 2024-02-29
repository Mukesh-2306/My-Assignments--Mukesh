package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String text=new String("changeme");
		String text1="";
		
		
		
		char[] chr = text.toCharArray();
		//charArry= c  h  a  n  g  e  m
		//         [0][1][2][3][4][5][6] 		
		//output 	c  H  a  N  g  E  m
		for (int i = 0; i < chr.length; i++) {
			
			if(i%2 ==1) {
				
				chr[i]=Character.toUpperCase(chr[i]);
				
				System.out.print(chr[i]);
				
			}
			else {
				System.out.print(chr[i]);
			}
			
		}

	}

}
