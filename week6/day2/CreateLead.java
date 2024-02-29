package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
	@Test(dataProvider = "mukesh")
	public  void runCreateLead(String companyName,String firstName,String lastName) {
		
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="mukesh")
	public String[][] data1() throws IOException {
		
		LearnReadData obj = new LearnReadData();
		String[][] data = obj.excelData();
		
		
		
		
		
		
	/*	data[0][0] = "testleaf";
		data[0][1] = "mukesh";
		data[0][2] = "D S";
		
		data[1][0] = "testleaf";
		data[1][1] = "rajesh";
		data[1][2] = "R";
		
		data[2][0] = "Testleaf";
		data[2][1] = "yoga";
		data[2][2] = "M";*/
		
		return data;
		
		
	}
}






