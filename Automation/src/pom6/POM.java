package pom6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM {
@FindBy(xpath="//select[@name='birthday_day']") private WebElement day;


POM(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void selectDay(String a) {
	Select s=new Select(day);
	s.selectByVisibleText(a);
}
}
