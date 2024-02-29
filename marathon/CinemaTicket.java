package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CinemaTicket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select drop1 = new Select(city);
		drop1.selectByValue("Chennai");
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select drop2 = new Select(genre);
		drop2.selectByIndex(3);
		WebElement Language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select drop3 = new Select(Language);
		drop3.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cine = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select cinema = new Select(cine);
		cinema.selectByValue("PVR Heritage RSL ECR Chennai");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[2]")).click();
		WebElement time = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timing =new Select(time);
		timing.selectByValue("12:00 PM - 03:00 PM");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.name("name")).sendKeys("mukesh");
		driver.findElement(By.name("email")).sendKeys("mukesh@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9677477154");
		WebElement food = driver.findElement(By.name("food"));
		Select food1 =new Select(food);
		food1.selectByValue("No");
		driver.findElement(By.name("comment")).sendKeys("Parking");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='×']")).click();
		String title = driver.getTitle();
		if(title.contains("Movie Library")) {
			System.out.println("Page Title is Verified :" + title);
			
		}else {
			System.out.println("Page Title is not verified");
		}
		
		
			
		
		
		
		
		

	}

}
