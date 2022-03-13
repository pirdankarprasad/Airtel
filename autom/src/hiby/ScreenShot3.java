package hiby;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date date=new Date();
	System.out.println(date);
	String path = date.toString().replace(":", "_");
	File f=new File("E:\\Testing\\ScreenShots\\image"+path+".jpg");
	FileHandler.copy(source, f);
	
	
	
	
}

}
