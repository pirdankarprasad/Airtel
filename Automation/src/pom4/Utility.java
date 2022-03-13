package pom4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testclass.Configuration;

public class Utility {
	public WebDriver initdriver() {
		System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	public String readExcelSheet(int a, int b) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Testing\\Parameterization\\T1.xlsx");
		String w = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		return w;
	}
	public double readExcelSheet1(int a, int b) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Testing\\Parameterization\\T1.xlsx");
		 double w = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getNumericCellValue();
		return w;
}
}
