package week3.day4;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input="babu";
		//output a u 
		char[] tochar=input.toCharArray();
		
		Set<Character> charset=new HashSet<Character>();
		for (int i = 0; i < tochar.length; i++) {
			
			if (charset.contains(tochar[i])) {
				
				charset.remove(tochar[i]);
			}else {
				charset.add(tochar[i]);
			}
			
			
				
			
		}System.out.println(charset);

	}

}
