package appiumbasicslearning;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest{
	
	
	@Test
	public void browserTest() {
		
		driver.get("https://www.rahulshettyacademy.com/practice-project");
		System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vijaybhaskar07@gmail.com");
		driver.findElement(By.xpath("//input[@id='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		
	}

}
