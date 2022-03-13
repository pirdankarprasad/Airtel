package com.test.ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class C {
@AfterClass
public void TC06() {
	Reporter.log("After class executed");
}
@AfterMethod
public void TC07() {
	Reporter.log("After Method Executed");
}
@Test()
public void TC08() {
	Reporter.log("TC01 executed");
}
}
