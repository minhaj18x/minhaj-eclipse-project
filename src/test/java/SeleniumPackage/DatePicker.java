package SeleniumPackage;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DatePicker {

WebDriver driver;
	
@BeforeTest
  public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }

@Test
public void pickDate() throws InterruptedException
{
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("document.getElementById('datepicker1').value= '02/07/2025'");
	
	Thread.sleep(2000);
	
	js.executeScript("document.getElementById('datepicker2').value= '02/17/2025'");
	
	Thread.sleep(2000);
}
  
  @AfterTest
  public void TearDown()
  {
	  driver.quit();
  }
  
  
}
