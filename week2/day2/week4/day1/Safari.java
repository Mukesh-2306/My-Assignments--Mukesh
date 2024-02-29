package week4.day1;

public class Safari extends Browser {
	
	public void readMode() {
		System.out.println("readMode from safari");
	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode from safari");
	}

	public static void main(String[] args) {


		Safari obj2=new Safari();
		//browser class
		obj2.openURL();
		obj2.closeBrowser();
		obj2.navigateBack();


	}

}
