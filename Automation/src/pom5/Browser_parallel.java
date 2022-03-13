package pom5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testclass.Configuration;

public class Browser_parallel {
	@Test
	@Parameters("browser")
	public void TC01(String name) {
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Testing\\Firfox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		else {
			System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
	}

}
