package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TableTest {

  WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amitha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-filter.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}
	
	  @Test
	  public void testcAse1() throws InterruptedException {
		  Thread.sleep(4000);
		  WebElement text = driver.findElement(By.xpath("//table[@id='example']//thead//tr[2]//th[2]//input"));
		  text.sendKeys("Software Engineer");
	  }
}
