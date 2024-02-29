package week4.day3;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomErail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("No of trains: " + rowsize);
		Set<WebElement> setrows = new LinkedHashSet<WebElement>(rows);
		int uniquesize = setrows.size();
		System.out.println("Unique No of Trains " +uniquesize);
		
		List<WebElement> findElements = table.findElements(By.tagName("td"));
		
		for (int i = 2; i <setrows.size(); i++) {
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			System.out.println(trainName);
		}
		if(rowsize==uniquesize) {
			System.out.println("Verified : their is no duplicate train name");
		}else {
			System.out.println("Have some in the train name ");
		}
		
		
		
		

	}

}
