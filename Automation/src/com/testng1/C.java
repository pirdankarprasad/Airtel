package com.testng1;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class C {
	@Test (groups="sell")
	public void TC06() {
		Reporter.log("TC06 executed", true);
	}
	@Test (groups="intraday")
	public void TC07() {
		Reporter.log("TC07 executed", true);
	}
}
