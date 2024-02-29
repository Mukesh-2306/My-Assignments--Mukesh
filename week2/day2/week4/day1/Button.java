package week4.day1;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("submit method form button sub class");
	}

	public static void main(String[] args) {
		Button obj =new Button();
		obj.click();
		obj.setText("sdagsadg");
		obj.submit();
	}

}
