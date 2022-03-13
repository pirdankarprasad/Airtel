package pom5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM {
	
	@FindBy(xpath="//select[@name='birthday_day']") private WebElement day;
	@FindBy(xpath="//select[@name='birthday_year']") private WebElement year;
	
	POM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void selectDay(double a) {
		Select sel=new Select(day);
		sel.selectByValue(Double.toString(a));
	}
	

}
