package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		WebElement busname = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
		String text = busname.getText();
		System.out.println("The First Bus Name is " + text);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement seats = driver.findElement(By.xpath("(//div[@class='text-grey']/small)[1]"));
		String avaiable = seats.getText();
		System.out.println(avaiable);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper']//span)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md '])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		WebElement seat_name = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]"));
		String seatname = seat_name.getText();
		System.out.println("selected seat :" + seatname);
		WebElement price = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]"));
		String price1 = price.getText();
		System.out.println("Base Fare : " + price1);
		String title = driver.getTitle();
		//if(text.contains("Chennai to Bangalore Bus Ticket Booking at AbhiBus"));
		System.out.println(title);
		driver.close();
		
		
		

	}

}
