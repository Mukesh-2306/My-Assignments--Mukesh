package week4.day1;

public class OverLoadingPolymorphsim {
	
	public void reportStep(String msg,String status) {
		System.out.println(msg);
		System.out.println(status);
		
	}
	public void reportStep(String msg,String status,boolean snap) {
		
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		
		OverLoadingPolymorphsim obj	=new OverLoadingPolymorphsim();
		
		obj.reportStep("hello", "fine");
		obj.reportStep("hi", "not fine", false);

	}

}
