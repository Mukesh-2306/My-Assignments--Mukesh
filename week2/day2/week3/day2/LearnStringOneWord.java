package week3.day2;

public class LearnStringOneWord {

	public static void main(String[] args) {
		String text="I Love Chicken Briyani";
			      // 0  1    2       3
		// we want to print like "I evoL Chicken inayirB"
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if (i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1; j>=0 ; j--) {
					System.out.print(charArray[j]+"");
					
				}
				
			}else {
				System.out.print(split[i]+" ");
			}
			
			
			
		}

	}

}
