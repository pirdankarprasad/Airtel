package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	Actions act=new Actions (driver);
	act.moveToElement(day).click().build().perform();
	for(int i=1; i<=5; i++) {
	act.sendKeys(Keys.ARROW_UP);
	Thread.sleep(1000);
	}
	act.click().perform();
	Thread.sleep(2000);
	act.contextClick(day).perform();
	
}
}
