package pom6;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class TC01 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Utility u=new Utility();
	WebDriver driver = u.initDriver();
	driver.get("https://www.facebook.com/signup");
	
	POM p=new POM(driver);
	p.selectDay(u.readExcelSheet(5, 1));
	
}
}
