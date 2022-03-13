package hiby;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	Iterator<String> window = ids.iterator();
	 
		String a = window.next();
		String b=window.next();
		driver.switchTo().window(b);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(a);
		Thread.sleep(2000);
		driver.close();
		
	}
	
}

