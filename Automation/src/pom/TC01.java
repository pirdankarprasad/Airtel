package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Login lg=new Login(driver);
	lg.Userid("pirdankarprasad@gmail.com");
	lg.Password("Pirdankar@07");
	lg.LogInn();
	driver.close();
	
	
}

}
