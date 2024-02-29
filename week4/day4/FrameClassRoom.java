package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassRoom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// switch to frame by index // to switch the driver control to frame
		driver.switchTo().frame(1);
		// click the button in side the frame 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//while clicking the button got a popup of confirmation alert 
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		String text1 = driver.findElement(By.xpath("//button[text()='Try it']/following::p")).getText();
		System.out.println(text1);
		
		
	
	
	
	
	
	
	
	}

}
