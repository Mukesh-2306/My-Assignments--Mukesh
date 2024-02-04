package learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("mukesh.org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mukesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 =new Select(source);
		drop1.selectByIndex(4);
		WebElement Marketingcampagin = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 =new Select(Marketingcampagin);
		drop2.selectByVisibleText("Automobile");
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3 = new Select(Ownership);
		drop3.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("web page is verified");
			
		}
		else {
			System.out.println("web page is not verified");
		}
		driver.close();
		

	}

}
