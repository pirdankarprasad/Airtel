package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hiby.Configuration;

public class ActionClass2 {
public static void main(String [] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Actions act=new Actions(driver);
	act.moveToElement(month).click().build().perform();
	for(int i=0; i<=10; i++) {
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
}
	act.click().perform();
}
}
