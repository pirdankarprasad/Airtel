package pom5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	WebDriver  driver;
@FindBy(xpath="//input[@id='alertbtn']") private WebElement alert;
@FindBy(xpath="//select[@id='dropdown-class-example']") private WebElement select;


POM1(WebDriver dri){
	PageFactory.initElements(dri, this);
}
public void useAlert() throws InterruptedException {
	alert.click();
	Thread.sleep(2000);
	Alert act = driver.switchTo().alert();
	act.dismiss();
	
	
}

}
