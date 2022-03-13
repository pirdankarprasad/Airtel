package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hiby.Configuration;

public class Actionss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	act.moveToElement(day).click().build().perform();

	Thread.sleep(2000);
	for(int i=0; i<=10; i++) {
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(500);
	}
	act.sendKeys(Keys.ENTER).perform();
	
}
}
