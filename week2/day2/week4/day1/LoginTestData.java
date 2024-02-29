package week4.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("enterUsername from sub class LoginTestData");
	}
	public void enterPassword() {
		System.out.println("enterUsername from sub class enterPassword");
	}

	public static void main(String[] args) {
		LoginTestData obj =new LoginTestData();
		
		
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
		

	}

}
