package hiby;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChildPopup {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
	Set<String> hd = driver.getWindowHandles();  //to get id of window

	Iterator<String> it = hd.iterator();
	while(it.hasNext()) {
		//String parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
	
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	Set<String> hd1 = driver.getWindowHandles();
	Iterator<String> it1 = hd1.iterator();
	String main = it1.next();
	String next = it1.next();
	driver.switchTo().window(next);
	Thread.sleep(2000);
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File f=new File(Configuration.screenshotpath);
	FileHandler.copy(Source, f);
	driver.close();
	File f1=new File("E:\\Testing\\ScreenShots\\image6");
	FileHandler.copy(Source, f1);
	
}
}