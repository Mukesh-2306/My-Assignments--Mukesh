package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text= "We learn Java basics as part of java sessions in java week1 ";
		//output We learn Java basics as part of sessions in week1
		//convert the given string to lowercase letters for 	
		String words = text.toLowerCase();
		// split the given string into words store in array 
		String[] split = words.split(" ");
		
		
		for (int i = 0; i < split.length; i++) {
			
			for (int j =i+1; j < split.length; j++) {
				
				if(split[i].equals(split[j])) {
					split[j]="";
					
				}
			}
				
			
			System.out.print(split[i] +" ");
		}
	}

}
