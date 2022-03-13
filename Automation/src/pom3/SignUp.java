package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
@FindBy(xpath="//input[@name='firstname']") private WebElement FirstName;
@FindBy(xpath="//input[@name='lastname']") private WebElement LastName;
@FindBy(xpath="//input[@name='reg_email__']") private WebElement Email;
@FindBy(xpath="//select[@name='birthday_day']") private WebElement Day;
@FindBy(xpath="//select[@name='birthday_month']") private WebElement Month;
@FindBy(xpath="//select[@name='birthday_year']") private WebElement Year;
@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement Gender;

SignUp(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void enterFirstName(String name) {
	FirstName.sendKeys(name);
}
public void enterLastName(String lname) {
	LastName.sendKeys(lname);
}
public void enterEmail(String email) {
	Email.sendKeys(email);
}
public void selectDay(String D) {
	Select sel=new Select(Day);
	sel.selectByVisibleText(D);
}
public void selectMonth(String M) {
	Select sel1=new Select(Month);
	sel1.selectByVisibleText(M);
}
public void selectYear(String Y) {
	Select sel2=new Select(Year);
	sel2.selectByVisibleText(Y);
}
public void selectGender() {
	Gender.click();
}


}
