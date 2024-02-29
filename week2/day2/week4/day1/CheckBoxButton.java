package week4.day1;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("clickCheckButton method from CheckBoxButton sub class");
	}

	public static void main(String[] args) {
		CheckBoxButton muk=new CheckBoxButton();
		
		muk.click();
		muk.setText("asfasf");
		muk.submit();
		muk.clickCheckButton();
		

	}

}
