package week3.day3;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBags {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[@class='length']"));
		String text = findElement.getText();
		System.out.println(text);
		//creating webelement for brand names display in the web page
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		//while using web element use for loop for print all
		
		System.err.println("list of brand names");
		for (int i = 0; i < brandNames.size(); i++) {
			//get the brand names using get text method
			String text2 = brandNames.get(i).getText();
			//print all brand names
			
			System.out.println(text2);
		}
		
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("List of Bag Names");
		for (int j = 0; j < bagName.size(); j++) {
			
			String text3 = bagName.get(j).getText();
			
			
			System.out.println(text3);
			
			
		}

	}

}
