package com.testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
@Test(timeOut=1000)
public void TC01() throws InterruptedException {
	Reporter.log("TC01 is executed", true);
	Thread.sleep(2000);
	Assert.fail();
}
@Test
public void TC02() {
	Reporter.log("TC02 is executed", true);
}
@Test
public void TC03() {
	Reporter.log("TC03 is executed", false);
}
}
