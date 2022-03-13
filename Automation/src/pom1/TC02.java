package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Login1 lg=new Login1(driver);
	lg.UserId("ABC");
	lg.Pass("DEF");
	lg.Log();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	lg.UserId("asd");
	lg.Pass("456");
	lg.Log();
}
}
