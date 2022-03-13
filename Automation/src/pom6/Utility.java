package pom6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testclass.Configuration;

public class Utility {
public WebDriver initDriver() {
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	return driver;
	
}
public String readExcelSheet(int a, int b) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("E:\\Testing\\Parameterization\\T1.xlsx");
	String s = WorkbookFactory.create(f).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
	return s;
}
}
