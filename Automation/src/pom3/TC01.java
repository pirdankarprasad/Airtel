package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	SignUp s=new SignUp(driver);
	s.enterFirstName("Prasad");
	s.enterLastName("Pirdankar");
	s.enterEmail("pirdankar07@gmail.com");
	s.selectDay("26");
	s.selectMonth("Feb");
	s.selectYear("1997");
	s.selectGender();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/signup");
	s.enterFirstName("Pra");
	s.enterLastName("Pirdr");
	s.enterEmail("kar07@gmail.com");
	s.selectDay("27");
	s.selectMonth("Mar");
	s.selectYear("1996");
	s.selectGender();
	
}
}
