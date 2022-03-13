package pom1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1{
	//Declaration
	@FindBy(xpath="//input[@id='email']")private WebElement Uid;
	@FindBy(xpath="//input[@id='pass']") private WebElement Pass;
	@FindBy(xpath="//button[@name='login']")private WebElement LogIn;
	
	//intialization
	Login1(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	//Declaration 
	public void UserId(String a) {
		Uid.sendKeys(a);
	}
	public void Pass(String b) {
		Pass.sendKeys(b);
	}
	public void Log() {
		LogIn.click();
	}
	
}
