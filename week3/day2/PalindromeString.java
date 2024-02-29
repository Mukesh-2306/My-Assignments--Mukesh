package week3.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String text=new String("madam");
		String text1="";
		
		char[] charArray = text.toCharArray();
		// chararray=[0],[1],[2],[3],[4]
		//            m   a   d   a   m
		for (int i = charArray.length-1; i >=0; i--) {
			//System.out.print(charArray[i]);
			text1= text1+charArray[i];
		}
			if (text.equals(text1)) {
				System.out.println("given string is palindrom");
				
				
			}
			else {
				System.out.println("given string is not palindrom");
			}
		}
			
		
		
				

	}


