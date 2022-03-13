package auto;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("E:\\Testing\\Facebook.xlsx");
	String ui = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(ui);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	String path = d.toString().replace(":", "_");
	File f=new File("E:\\Testing\\ScreenShots\\image_"+path+".jpg");
	FileHandler.copy(source, f);
	WebElement sel = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(sel);
    s.selectByVisibleText("26");
    WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
    Actions act=new Actions(driver);
    act.moveToElement(month).click().build().perform();
    act.sendKeys(Keys.ARROW_UP).click().build().perform();
    List<WebElement> dr = driver.findElements(By.xpath("//select"));
    System.out.println(dr.size());
    System.out.println(dr.get(2).getText());
    
    
}
}
