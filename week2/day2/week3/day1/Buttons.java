package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title1 = driver.getTitle();
		if (title1.contains("Dashboard")) {
			System.out.println("The Page Title is Dashboard");
		}else {
			System.out.println("The Page Title is Not Dashboard");
		}
		driver.navigate().back();
		boolean displayed = driver.findElement(By.xpath("(//div[@class='card']/h5)[2]")).isDisplayed();
		System.out.println("Confirm if the button is disabled. "+ displayed);
		Point location = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
		System.out.println("location of find the positon of submit butto is :" + location);
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println("Color of the Button is : " +cssValue);
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("size of the button is: " +size);
		driver.close();
		
		
	}

}
