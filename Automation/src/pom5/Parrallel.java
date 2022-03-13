package pom5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testclass.Configuration;

public class Parrallel {
	@Test
	public void TC01() {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void TC02() {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");

}
	@Test
	public void TC03() {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");

}
}
