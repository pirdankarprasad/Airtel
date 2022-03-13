package hiby;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello");
	
	//Set Date
	Date date=new Date();
	System.out.println(date);
	String path = date.toString().replace(":", "_");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File f=new File("E:\\Testing\\ScreenShots\\image_"+path+".jpeg");
	FileHandler.copy(source, f);

			
}
}
