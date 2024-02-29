package week4.day2;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("cashOnDelivery from interface ");
		
	}

	public void upiPayment() {
		System.out.println("upiPayment from interface");
		
	}

	public void cardPayment() {
		System.out.println("cardPayment from interface");
		
	}

	public void internetBanking() {
		System.out.println("internetBanking from interface");
		
	}
	
	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Amazon obj =new Amazon();
		CanaraBank obj1 =new Amazon();
		obj.cashOnDelivery();
		obj.upiPayment();
		obj.cardPayment();
		obj.internetBanking();
		obj1.recordPaymentDetails();
		
	}

	
	


}
