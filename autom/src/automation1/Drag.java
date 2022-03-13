package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hiby.Configuration;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		driver.switchTo().frame(3);
		WebElement img = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(img, trash).click();
		
}
}
