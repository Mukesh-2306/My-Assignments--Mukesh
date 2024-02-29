package week4.day1;

public class OverRide extends OverLoadingPolymorphsim{
	
	public void reportStep(String msg,String status) {
		System.out.println("Message:"+msg);
		System.out.println("how are you:"+status);
		
	}
	public static void main(String[] args) {
		OverRide obj1= new OverRide();
		obj1.reportStep("hello", "fine", false);
		obj1.reportStep("Hi", "Good");

	}

}
