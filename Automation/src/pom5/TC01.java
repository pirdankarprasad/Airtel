package pom5;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class TC01 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Utility ut=new Utility();
	WebDriver driver = ut.initdriver();
	driver.get("https://www.facebook.com/signup");
	
	POM p=new POM(driver);
	p.selectDay(ut.readExcelSheet1(5, 1));
}
}
