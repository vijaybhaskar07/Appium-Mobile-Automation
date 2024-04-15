package appiumbasicslearning;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{
	
	@Test
	public void scrollDemoTest() throws MalformedURLException{
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		scrollToEndAction();
		
	}

}
