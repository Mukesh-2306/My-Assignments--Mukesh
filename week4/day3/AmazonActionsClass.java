package week4.day3;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionsClass {

	public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver = new ChromeDriver();

	//Load the URL (https://www.amazon.in/)
	driver.get("https://www.amazon.in/");
	
	//Maximize the browser window
	driver.manage().window().maximize();
	
	//Add an implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// enter oneplus 9 pro in the search box
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	
	//get the price of first getting result 
	String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	
	System.out.println("price of the first product is :" + text);
	//get the number of customers make review on it 
	String text2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]")).getText();
	
	System.out.println(text2 + " no of customer given rating for the first displayd prodrct");
	
	// click the first displayed product
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	
	//after clicking first product new tab getting opened so go for windows haldel
	//get the no tabs in list 
	Set<String> windowHandles = driver.getWindowHandles();
	//initlize the empty list and pass the set obj in list constructor
	List<String> tabs = new ArrayList<String>(windowHandles);
	// get the no of tab for clarify we want to work in which tab
	System.out.println(windowHandles.size());
	//switch the control to windows
	driver.switchTo().window(tabs.get(1));
	//Take a screenshot of the product displayed.
	// create a source for get screeshort it stored in temp memory 
	File source = driver.getScreenshotAs(OutputType.FILE);
	// create a destination for store the source file name a folder and give a image formate 
	File destination = new File("./assignment/img002.png");
	// copy the source file to destination
	FileUtils.copyFile(source, destination);
	//Click the 'Add to Cart' button.

	WebElement element = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
	
	Actions blilder = new Actions(driver);
	blilder.click(element).perform();
	String text3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	
	System.out.println(text3);
	
	if (text.equals(text3)) {
		System.out.println("verified : the price of the cart in correct ");
		
	}
	else {
		System.out.println("the price of the cart in not correct  ");
	}
	
	
	
	
	
	}

}
