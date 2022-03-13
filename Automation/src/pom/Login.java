package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//Declaration
@FindBy(xpath="//input[@id='email']") private WebElement Uid;
@FindBy(xpath="//input[@id='pass']") private WebElement Pass;
@FindBy(xpath="//button[@name='login']")private WebElement LogIn;

//intialization
Login(WebDriver driver){
	PageFactory.initElements(driver, this);
}
//Usage
public void Userid(String uid) {
	Uid.sendKeys(uid);
}
public void Password(String pass) {
	Pass.sendKeys(pass);
}
public void LogInn() {
	LogIn.click();
}

}
