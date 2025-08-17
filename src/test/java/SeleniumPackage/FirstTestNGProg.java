package SeleniumPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTestNGProg {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("First testng program");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();;
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.quit();
  }
}
