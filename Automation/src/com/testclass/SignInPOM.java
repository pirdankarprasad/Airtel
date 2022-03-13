package com.testclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignInPOM {
	WebDriver driver;
	@FindBy(xpath="//input[@name='firstname']") private WebElement fname;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
	@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement pass;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;
	
	
	
	SignInPOM(WebDriver dri){
		driver=dri;
		PageFactory.initElements(dri, this);
		
	}
	public void enterFirstName(String a) {
		fname.sendKeys(a);
	}
	public void enterLastName(String b) {
		lname.sendKeys(b);
	}
	public void enterEmail(String c) {
		email.sendKeys(c);
	}
	public void selectMonth(String d) {
		Select s=new Select(month);
		s.selectByVisibleText(d);
	}
	public void screenshot() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String path = d.toString().replace(":", "_");
		File f=new File("E:\\Testing\\ScreenShots\\image_"+path+".jpg");
		FileHandler.copy(source, f);

		
	}
}
