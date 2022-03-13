package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignIn1 {
@FindBy(xpath="//input[@name='firstname']") private WebElement firstname;
@FindBy(xpath="//input[@name='lastname']") private WebElement lastname;
@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement password;
@FindBy(xpath="//select[@name='birthday_day']")private WebElement day;
@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
@FindBy(xpath="//select[@name='birthday_year']") private WebElement year;
@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement gender;
@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement signup;


SignIn1(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void enterFirstName(String a) {
	firstname.sendKeys(a);
}
public void enterLastName(String b) {
	lastname.sendKeys(b);
}
public void enterEmail(String c) {
	email.sendKeys(c);
}
public void enterPassword(String d) {
	password.sendKeys(d);
}
public void selectDay(String e) {
	Select s1=new Select(day);
	s1.selectByVisibleText(e);
}
public void selectMonth(String f) {
	Select s2=new Select(month);
	s2.selectByVisibleText(f);
}
public void selectYear(String g) {
	Select s3=new Select(year);
	s3.selectByVisibleText(g);
}
public void selectGender() {
	gender.click();
}
public void enterSignup() {
	signup.click();
}
}
