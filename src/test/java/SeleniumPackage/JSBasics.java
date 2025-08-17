package SeleniumPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSBasics {
	@Test
	public void f() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		String Title = js1.executeScript("return document.title").toString();

		System.out.println("Webpage title is: " + Title);

		driver.get("https://www.yahoo.com");
		
		Thread.sleep(2000);
		
		js1.executeScript("window.history.back()");
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
