package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqeValues {

	public static void main(String[] args) {
		
		String input="google";
		//output = gole
		//
		char[] charArray = input.toCharArray();
		//System.out.println(charArray);
		Set <Character> name =new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			name.add(charArray[i]);
			
			
			
		}
		System.out.println(name);

	}

}
