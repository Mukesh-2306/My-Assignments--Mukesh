package week4.day1;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("selectRadioButton method form radio buttion sub class");
		
	}

	public static void main(String[] args) {
		RadioButton obj =new RadioButton();
		
		obj.click();
		obj.setText("adfdg");
		obj.submit();
		obj.selectRadioButton();
		
		

	}

}
