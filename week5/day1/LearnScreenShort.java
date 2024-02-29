package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShort {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("./snapshot/001.png");
		
		FileUtils.copyFile(source1, destination1);
		
		WebElement findElement = driver.findElement(By.xpath("//span[@class='allcircle circleone']"));
		
		File source2 = findElement.getScreenshotAs(OutputType.FILE);
		
		File destination2 = new File("./snapshot/002.png");
		
		FileUtils.copyFile(source2, destination2);
		
		

	}

}
