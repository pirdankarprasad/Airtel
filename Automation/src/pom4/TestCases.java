package pom4;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class TestCases {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Utility ut=new Utility();
	WebDriver driver = ut.initdriver();
	driver.get("https://www.facebook.com/signup");
			POM p=new POM(driver);
			p.enterName(ut.readExcelSheet(1, 1));
			p.enterLname(ut.readExcelSheet(2, 1));
		p.enterEmail(ut.readExcelSheet(3, 1));
			p.enterPassword(ut.readExcelSheet(4, 1));
		p.selectDay(ut.readExcelSheet1(5, 1));
			p.selectMonth();
			p.selectYear(ut.readExcelSheet1(7, 1));
			
			
		
}
}
