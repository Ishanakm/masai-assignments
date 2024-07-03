package multiple_testcase;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit
{
	ChromeDriver driver;
 @BeforeMethod
 public void launch()
 {
	driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
 }
 
 @AfterMethod
 public void quit() throws InterruptedException
 {
	 Thread.sleep(2000);
	 driver.close();
 }
}