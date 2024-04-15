package appiumbasicslearning;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MiscellaneousAppiumActions extends BaseTest{
	
	@Test
	public void appiumTest() throws MalformedURLException {
		
			
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies\']")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
			String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
			Assert.assertEquals(alertTitle, "WiFi settings");
			driver.findElement(By.id("android:id/edit")).sendKeys("Vijay WIFI");
			driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
			
			
			
			}
}
