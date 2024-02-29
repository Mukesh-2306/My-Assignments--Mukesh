package week2.day1;

public class Mobile {
	
	public String makeCall() {
		String mobileModel="poco";
		float mobileWeight=15.f;
		System.out.println("mobile_name "+ mobileModel);
		System.out.println("mobile_weight "+ mobileWeight);
		return null;
		
		
	}
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost=15000;
		System.out.println("charge_full "+ isFullyCharged);
		System.out.println("price " + mobileCost);
		
	}

	public static void main(String[] args) {
		
		Mobile phone =new Mobile();
		System.out.println("This is my mobile");
		phone.makeCall();
		phone.sendMsg();
		

	}

}
