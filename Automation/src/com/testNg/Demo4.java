package com.testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {
@Test
public void TC01() {
	Reporter.log("TC01 is executed", true);
}
@Test
public void TC02() {
	System.out.println("TC02 executed");
}
@BeforeClass
public void TC03() {
	System.out.println("TC03");
}
@AfterClass
public void TC04() {
	System.out.println("TC04)");
}
@BeforeMethod
public void TC05() {
	System.out.println("TC05");
}
@AfterMethod
public void TC06() {
	System.out.println("TC06");
}
}
