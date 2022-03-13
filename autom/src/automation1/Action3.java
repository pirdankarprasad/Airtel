package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hiby.Configuration;

public class Action3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Actions act= new Actions (driver);
	act.moveToElement(year).click().build().perform();
	for (int i=1; i<=25; i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
	}

	for (int i=1; i<=15; i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
	}
	
}
}
