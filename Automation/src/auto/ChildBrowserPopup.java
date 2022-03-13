package auto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Set<String> win = driver.getWindowHandles();
	Iterator<String> it = win.iterator();
	while(it.hasNext()) {
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.close();
	}

	
	
	
}
}
