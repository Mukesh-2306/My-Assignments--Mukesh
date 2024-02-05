package learn.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Mukesh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("title of the page is verified");
			
			
		}else {
			System.out.println("title of the page is not verified");
		}
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[3]")).click();
		WebElement v1 = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		v1.clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("mukesh test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String text1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (text1.contains("mukesh test")) {
			System.out.println("change name is appears");
			
			
		} else {
			System.out.println("change name is not appears");
		}
		
		driver.close();

	}

}
