package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> office = new ArrayList<String>();
		for (int i = 0; i < company.length; i++) {
			
			office.add(company[i]);
			
		}
		Collections.sort(office);
		
		Collections.reverse(office);
		
		System.out.println("reversed array list is " + office);
		
		

	}

}
