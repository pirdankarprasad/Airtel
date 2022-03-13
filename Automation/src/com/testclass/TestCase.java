package com.testclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class TestCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	Utility ut=new Utility();
	WebDriver driver = ut.initdriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	
	
	SignInPOM s=new SignInPOM(driver);
	s.enterFirstName(ut.readExcelSheet(1, 2));
	s.enterLastName(ut.readExcelSheet(2, 2));
	s.enterEmail(ut.readExcelSheet(3, 2));
	s.selectMonth(ut.readExcelSheet(6, 2));
	Thread.sleep(2000);
	s.screenshot();
	
	
	
	
	
	
}



}
