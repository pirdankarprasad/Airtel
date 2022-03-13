package automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hiby.Configuration;

public class Links2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement> a = driver.findElements(By.xpath("//select"));
	System.out.println(a.size());
	System.out.println(a.get(1).getText());
	
	

	
	

}
}
