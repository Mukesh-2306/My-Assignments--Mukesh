package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicityWait {

	public static void main(String[] args) {
		//setup the driver and Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://login.salesforce.com/");
		//Maximize the screen
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		driver.findElement(By.id("username")).sendKeys("princilaroseline.edward@testleaf.com");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Princila@123");
		//click login button
		driver.findElement(By.id("Login")).click();
		//Thread.sleep(3000);
		//click on app launcher
		driver.findElement(By.className("slds-icon-waffle")).click();

		}

		}
