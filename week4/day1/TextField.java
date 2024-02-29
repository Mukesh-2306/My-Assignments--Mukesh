package week4.day1;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("getText method form TextField sub class");
		
	}
	
	

	public static void main(String[] args) {
		TextField obj1 = new TextField();
		obj1.click();
		obj1.setText("sdgsdg");
		obj1.getText();
		

	}



	
}
