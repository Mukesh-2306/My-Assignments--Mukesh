package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

import net.bytebuddy.utility.privilege.SetAccessibleAction;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String a = "PayPal India";
		String b = a.replaceAll(" ", "");
		System.out.println(b);
		char[] charArray = b.toCharArray();
		
		Set<Character> charSet =new LinkedHashSet<Character>();
		Set<Character> dupCharSet =new LinkedHashSet<Character>();
		for (Character care : charArray) {
			charSet.add(care);
			
		}System.out.println(charSet);
		
		/*
		for (int i = 0; i < charArray.length; i++) {
			
			charSet.add(charArray[i]);
			if(charSet.contains(charArray[i])) {
				
				dupCharSet.addAll(charSet);
				
				
				
			}
		}System.out.println(dupCharSet);
		System.out.println(charSet);*/
		
		

	}

}
