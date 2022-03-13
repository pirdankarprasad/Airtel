package pom5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testclass.Configuration;

public class TC02 {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	
		POM1 p=new POM1(driver);
		p.useAlert();
		
	}
	
	
	
	
	
	

}
