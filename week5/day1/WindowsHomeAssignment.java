package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.core.backend.Options;

public class WindowsHomeAssignment {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		String parentwindow = driver.getWindowHandle();
		
		Set<String> childwindow = driver.getWindowHandles();
		
		List<String> childlist = new ArrayList<String>(childwindow);
		
		int size =childlist.size();
		System.out.println("no of windows is : " + size);
		
		driver.switchTo().window(childlist.get(1));
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]")).click();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> childWindow2 = driver.getWindowHandles();
		
		List<String> childlist2 = new ArrayList<String>(childWindow2);
		
		driver.switchTo().window(childlist2.get(1));
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//tr[1]/td[1]")).click();
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String title = driver.getTitle();
		
		if (title.equals("Merge Contacts | opentaps CRM")) {
			
			System.out.println("verified the page title is :" + title);
			
		}else {
			System.out.println();
		}
		
		
		
		
		

	}

}
