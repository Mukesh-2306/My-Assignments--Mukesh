package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Servicenow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notification");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://dev200784.service-now.com/");
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("I-Ks*dzGjO63");
	driver.findElement(By.id("sysverb_login")).click();
	
	Shadow shad = new Shadow(driver);
	shad.setImplicitWait(20);
	shad.findElementByXPath("//div[text()='All']").click();
	shad.setImplicitWait(20);
	shad.findElementByXPath("//span[text()='Service Catalog']").click();
	Thread.sleep(5000);
	//driver.switchTo().defaultContent();
	WebElement findElementByXPath = shad.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(findElementByXPath);
	driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
	//label[@class='radio-label']
	driver.findElement(By.xpath("//label[text()='Yes']")).click();
	driver.findElement(By.xpath("//input[contains(@class,'cat_item_option sc-content-pad form-control')]")).sendKeys("99");
	WebElement findElement = driver.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option ')]"));
	Select drop = new Select(findElement);
	drop.selectByValue("unlimited");
	
	driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[contains(text(),'512 GB')]")).click();
	driver.findElement(By.id("oi_order_now_button")).click();
	String title = driver.getTitle();
	if (title.equals(title)) {
		System.out.println("the order is palced ");
		
	}else {
		System.out.println("the order is palced");
	}
	String text = driver.findElement(By.id("requesturl")).getText();
	
	System.out.println("the order request number is : " + text);
	
	File souce = driver.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("./marathon iphone/img001.png");
	
	FileUtils.copyFile(souce, destination);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
