package pom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TC02 {
	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	SignIN signin=new SignIN(driver);
	signin.enterName("Prasad");
	signin.enterLastName("Pirdankar");
	signin.entermail("pirdankar07@gmail.com");
	signin.selectDay("26");
	signin.selectMonth("Feb");
	signin.selectYear("1997");
	//ss
	
	signin.reentermail("pirdankar07@gmail.com");
	signin.enterPassword("Pirdankar@007");
	signin.selectmale();
	signin.SignINN();
	Thread.sleep(3000);
	//ss
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	String path = d.toString().replace(":", "_");
	File f=new File(Configuration.screenshot+path+".jpg");
	FileHandler.copy(source, f);
	driver.close();
	
}
}
