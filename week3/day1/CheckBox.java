package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("(//div[@class='col-12'])[4]/div")).click();
		WebElement findElement = driver.findElement(By.xpath("//p[text()='State = 1']"));
		
		String text = findElement.getText();
		
		if(text.contains("State = 1")) {
			System.out.println("Try state option is selected");
		}else {
			System.out.println("Try state option is not selected");
		}
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Checked']"));
		String text2 = findElement2.getText();
		if(text2.contains("Checked")) {
			System.out.println("The expected message is displayed");
		}else {
			System.out.println("The expected message is not displayed");
		}
		boolean displayed = driver.findElement(By.xpath("(//div[@class='col-12'])[5]")).isEnabled();
		if(displayed==false) {
			System.out.println("the check box is Disabled");
		}else {
			System.out.println("the check box is not Disabled");
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Brasilia'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		boolean selected = driver.findElement(By.xpath("//ul[@data-label='Cities']")).isSelected();
		System.out.println(selected);
		if(selected==false) {
			System.out.println("The multiple value is  value is selected");
		}
	}

}
