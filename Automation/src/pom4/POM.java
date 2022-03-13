package pom4;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM {
	WebDriver driver;
@FindBy(xpath="//input[@name='firstname']") private WebElement fname;
@FindBy(xpath="//input[@name='lastname']") private WebElement lname;
@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement pass;

@FindBy(xpath="//select[@name='birthday_day']") private WebElement day;
@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
@FindBy(xpath="//select[@name='birthday_year']") private WebElement year;

@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement male;
@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement signin;

POM(WebDriver dri){
	driver=dri;
	PageFactory.initElements(dri, this);
}

public void enterName(String a) {
	fname.sendKeys(a);
}
public void enterLname(String b) {
	lname.sendKeys(b);
	
}
public void enterEmail(String c) {
	email.sendKeys(c);
}
public void enterPassword(String d) {
	pass.sendKeys(d);
}
public void selectDay(double d ) {
 
 Select sel=new Select(day);
	sel.selectByVisibleText(Double.toString(d));
		
}
public void selectMonth() {
	Actions act=new Actions(driver);
	act.moveToElement(month).click().build().perform();
	for(int i=0; i<=2; i++) {
	act.sendKeys(Keys.ARROW_DOWN);
}
	act.click().build().perform();
}
public void selectYear(double d) {
	Select sel=new Select(year);
	sel.selectByIndex((int) d);
}
public void selectGender() {
	male.click();
}
public void signup() {
	signin.click();
}
}
