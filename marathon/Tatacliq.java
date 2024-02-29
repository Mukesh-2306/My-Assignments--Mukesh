package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		WebElement watchs = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(watchs).perform();
		driver.findElement(By.xpath("(//div[text()='Casio'])[1]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select drop=new Select(dropdown);
		drop.selectByIndex(3);
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		for (int i = 0; i < price.size(); i++) {
			Thread.sleep(5000);
			String text = price.get(i).getText();
			
			System.out.println( text);
		}
		String text1 = price.get(0).getText();
		System.out.println("first resulting watch price is : " +"" + text1);
		String firstProPrice = text1.replaceAll("[^0-9]", "");
		System.out.println(" after repace the symblos and " + firstProPrice);
		
		driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[1]")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("1st window title" + driver.getTitle());
		Set<String> nextTab = driver.getWindowHandles();
		
		List<String> nextTabe2 = new ArrayList<String>(nextTab);
		
		int size = nextTabe2.size();
		driver.switchTo().window(nextTabe2.get(1));
		System.out.println("2nd window title" + driver.getTitle());
		String text2 = driver.findElement(By.xpath("(//div[@class='ProductDetailsMainCard__price'])")).getText();
		String clickedproPrice = text2.replaceAll("[^0-9]", "");
		
		System.out.println(" after repace the symblos and " + clickedproPrice);
		if (firstProPrice.equals(clickedproPrice)) {
			System.out.println("both the price are similar");
			
		}else {
			System.out.println("both the price are not similar");
		}
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("the count of the cart icon is: " +""  + text);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./marathon/001.png");
		
		FileUtils.copyFile(source, destination);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
