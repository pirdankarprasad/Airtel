package hiby;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello");
	
	
	//select
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select Sel=new Select(day);
	Sel.selectByVisibleText("26");
	
	System.out.println(Sel.isMultiple());
	System.out.println(Sel.getFirstSelectedOption().getText());
	
	//Screenshot	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File f=new File("E:\\Testing\\ScreenShots\\image1.jpeg");
	FileHandler.copy(Source, f);
	
	
	
	
}
}
