package hiby;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	Iterator<String> window = ids.iterator();
	while(window.hasNext()) {
		String parent = window.next();
		String child = window.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
}
