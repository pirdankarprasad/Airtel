package pom;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
public String readExcelSheet(int a, int b) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("E:\\Testing\\Parameterization\\T1.xlsx");
	
	String id = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
	System.out.println(id);
	return id;
}
public static void main(String [] args) throws EncryptedDocumentException, IOException {
	Utility u=new Utility();
	u.readExcelSheet(1,1);
	u.readExcelSheet(2,1);
	u.readExcelSheet(3,1);
	u.readExcelSheet(4,1);
	u.readExcelSheet(5,1);
	u.readExcelSheet(6,1);
	u.readExcelSheet(7,1);
}
}
