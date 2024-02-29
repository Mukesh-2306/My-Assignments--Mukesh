package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text = prompt.getText();
		System.out.println(text);
		//prompt.sendKeys("testleaf");
		//prompt.accept();
		//String text2 = driver.findElement(By.id("confirm_result")).getText();
		//System.out.println(text2);
		prompt.dismiss();
		//String text2 = prompt.getText();
		//System.out.println(text2);
		String text2 = driver.findElement(By.id("confirm_result")).getText();
				System.out.println(text2);
		

	}

}
