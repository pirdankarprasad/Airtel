package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", Configuration.chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	SignIn1 s=new SignIn1(driver);
	Utility u=new Utility();
	s.enterFirstName(u.readExcelSheet(1, 1));
	s.enterLastName(u.readExcelSheet(2, 1));
	s.enterEmail(u.readExcelSheet(3, 1));
	s.enterPassword(u.readExcelSheet(4, 1));
	s.selectDay(u.readExcelSheet(5, 1));
	s.selectMonth(u.readExcelSheet(6, 1));
	s.selectYear(u.readExcelSheet(7, 1));
	s.selectGender();
	s.enterSignup();
	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	
}
}
