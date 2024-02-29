package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		boolean selected = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).isSelected();
		if(selected==true) {
			System.out.println("The radio button is selected");
		}else {
			System.out.println("The radio button is unselected");
		}
		boolean enabled = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		WebElement findElement = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		String text = findElement.getText();
		if (enabled==true) {
			System.out.println("The " +text+" radio button selected by default.");
			
		}else {
			System.out.println("their is no radio button selected by default. ");
		}
		boolean selected2 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		WebElement findElement2 = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		String text2 = findElement2.getText();
		if (selected2==true) {
			System.out.println(text2+" is not selected");
			
		}else {
			System.out.println("Yes the "+ text2+ " is already selected");
		}
		
	}
	

}
