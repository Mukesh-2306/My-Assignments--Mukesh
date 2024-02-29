package week4.day1;

public class TestData {
	
	public void enterCredentials() {
		
		System.out.println("enterCredentials from super class TestData");
	}
	
	public void navigateToHomePage() {
		System.out.println("navigateToHomePage from super class TestData");
	}

	public static void main(String[] args) {
		TestData	obj =new TestData();
		obj.enterCredentials();
		obj.navigateToHomePage();

	}

}
