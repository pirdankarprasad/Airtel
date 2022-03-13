package automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hiby.Configuration;

public class Links {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//Select"));
	int count = links.size();
	System.out.println(links.size());
	for(int i=0; i<=count-1; i++) {
		System.out.println(links.get(i).getText());
	}
	
}
}
