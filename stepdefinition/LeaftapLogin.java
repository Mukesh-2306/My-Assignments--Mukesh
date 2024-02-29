package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaftapLogin {
	ChromeDriver driver;
@Given("Open the chrome browser")
	public void openBrowser() {
		 driver = new ChromeDriver();

	}
	@Given("Load the application URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@And("enter the user name as {string}")
	public void enterUseName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	@And("enter the password as {string}")
	public void enterPassWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@When("Click on login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String actualResult="Leaftaps - TestLeaf Automation Platform";
		String exceptedResult = driver.getTitle();
		
		if (exceptedResult.equals(actualResult)) {
			System.out.println("Home page verified Successfully");
			
		}else {
			System.out.println("home page not displayed ");
		}

	}
	@But("error message should displyed")
	public void verifyErrorMsg() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}
	
}
