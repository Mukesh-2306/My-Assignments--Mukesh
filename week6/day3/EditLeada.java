package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	
	


public class EditLeada extends ProjectSpecificMethod{
	@BeforeTest
	public void excelData() {
		fileExceData="Edit Lead Data";
		
	}
	@Test(dataProvider = "mukesh")
	public  void runEditLeada(String phoneNumber, String companyName) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement ele = driver.findElement(By.id("updateLeadForm_companyName"));
		ele.clear();
		ele.sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






