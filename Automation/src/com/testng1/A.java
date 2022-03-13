package com.testng1;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
@Test(groups="buy")
public void TC01() {
	Reporter.log("TC01 executed",true);
	
}
@Test (groups="sell")
public void TC02() {
	Reporter.log("TC02 executed", true);
}
@Test (groups="intraday")
public void TC03() {
	Reporter.log("TC03 executed", true);
}
}
