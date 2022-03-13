package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignIN {

	@FindBy(xpath="//input[@name='firstname']") private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement LastName;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement Email;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//select[@name='birthday_day']") private WebElement Day;
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement Month;
	@FindBy(xpath="//select[@name='birthday_year']") private WebElement Year;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']") private WebElement Email2;
	@FindBy(xpath="(//input[@class='_8esa'])[2]") private WebElement Male;
	@FindBy(xpath="(//button[@type='submit'])[1]") private WebElement Signup;
	
	
	SignIN(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterName(String name) {
		FirstName.sendKeys(name);
	}
	public void enterLastName(String Lname) {
		LastName.sendKeys(Lname);
	}
	public void entermail(String email) {
		Email.sendKeys(email);
	}
	public void reentermail(String email2) {
		Email2.sendKeys(email2);
	}
	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	public void selectDay(String d) {
		Select dd=new Select(Day);
		dd.selectByVisibleText(d);
	}
	public void selectMonth(String M) {
		Select mm=new Select(Month);
		mm.selectByVisibleText(M);
	}
	public void selectYear(String Y) {
		Select yy=new Select(Year);
		yy.selectByVisibleText(Y);
	}
	public void selectmale() {
		Male.click();
	}
	public void SignINN() {
		Signup.click();
	}
	
	
	
	
	
	
	
}

