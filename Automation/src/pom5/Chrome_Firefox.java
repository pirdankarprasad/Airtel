package pom5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Chrome_Firefox {
	@Test
	public void TC01() {
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\Firfox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

}
