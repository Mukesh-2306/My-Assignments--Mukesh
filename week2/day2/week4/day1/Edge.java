package week4.day1;

public class Edge extends Chrome{

	public void takeSnap() {
		System.out.println("takeSnap from edge");
	}
	public void clearCookies() {
		System.out.println("clear Cookies from edge");
	}
	public static void main(String[] args) {
		Edge obj1=new Edge();
		//browser class
		obj1.openURL();
		obj1.closeBrowser();
		obj1.navigateBack();
		//chrome
		obj1.clearCache();
		obj1.openIncognito();
		

	}

}
