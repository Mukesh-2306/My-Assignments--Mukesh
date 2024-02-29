package week4.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		
	}
	
	public static void main(String[] args) {
		LoginPage obj =new LoginPage();
		obj.clickElement();
		obj.findElement();
		obj.enterText();
		obj.performCommonTasks();
		obj.performCommonTasks();
		
	}

}
