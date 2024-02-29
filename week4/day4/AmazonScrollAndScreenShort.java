package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScrollAndScreenShort {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement amazon = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		
		Actions builder=new Actions(driver);
		builder.scrollToElement(amazon).perform();
		

	}

}
