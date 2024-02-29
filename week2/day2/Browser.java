package week2.day2;

public class Browser {
	
	public String launchBrowser(String browsername) {
		System.out.println(browsername + " Brower Launched Sucessfully");
		return null;
	}
	public void loadUrl() {
		System.out.println("Application launched successfully");
	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser("chrome");
		b.loadUrl();
		

	}

}
