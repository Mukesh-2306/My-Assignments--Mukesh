package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		// get the first tab or window title 
		String title1 = driver.getTitle();
		// print the first tab or window title 
		System.out.println("title 1" + title1);
		// get the first tab or window url
		String currentUrl1 = driver.getCurrentUrl();
		// print the first tab or window url
		System.out.println("currentUrl 1" + currentUrl1);
		//switch the control 1st tab or 1st windows
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		//switch the control 2st tab or 2st windows
		Set<String> childWindow = driver.getWindowHandles();
		//initilize the empty list to get the  tab or windows title 
		//pass the set obj to list constructor 
		List<String> emptyList = new ArrayList<String>(childWindow);
		//to known the size or number of tab or windows 
		int size = emptyList.size();
		System.out.println("no of tabs " + size);
		//Switch the control to next window or child window
		driver.switchTo().window(emptyList.get(1));
		
		String title2 = driver.getTitle();
		System.out.println("title 2 "+title2);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("currentUrl 2 "+ currentUrl2);
		
		
		
		

	}

}
