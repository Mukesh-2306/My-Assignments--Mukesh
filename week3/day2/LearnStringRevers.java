package week3.day2;

public class LearnStringRevers {

	public static void main(String[] args) {
		String name="mukesh";
		char[] charname = name.toCharArray();
		for (int i = charname.length-1; i >= 0; i--) {
			System.out.println(charname[i]);
			
		}

	}

}
