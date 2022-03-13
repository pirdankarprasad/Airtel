package com.test.ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
@Test()
public void TC01() {
	Reporter.log("TC01 executed");
}
@Test(invocationCount=2)
public void TC02() {
	Reporter.log("TC02 executed");
}
@Test(priority=-1)
public void TC03() {
	Reporter.log("TC03 executed");
}

}
