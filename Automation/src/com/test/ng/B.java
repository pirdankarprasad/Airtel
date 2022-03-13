package com.test.ng;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B {
	@Test()
	public void TC04() {
		Reporter.log("TC01 executed");
}
	@BeforeClass
	public void TC05() {
		Reporter.log("BeforeClassExecuted");
	}
}