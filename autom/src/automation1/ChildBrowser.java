package automation1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hiby.Configuration;

public class ChildBrowser {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver", Configuration.ChromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while(it.hasNext()) {
			String child = it.next();
			String parent = it.next();
			driver.switchTo().window(parent);
			driver.manage().window().maximize();
		}
		
}
}