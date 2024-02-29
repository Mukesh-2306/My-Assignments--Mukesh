package week4.day1;

public class Chrome extends Browser{
	public void openIncognito() {
		
		System.out.println("open Incognito form chrome");
	}
	public void clearCache() {
		System.out.println("Clear cache form chrome" );
	}

	public static void main(String[] args) {
		Chrome obj=new Chrome();
		//browser class
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		
		
		

	}

}
