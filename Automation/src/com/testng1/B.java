package com.testng1;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
@Test(groups="buy")
public void TC04() {
	Reporter.log("TC04 executed", true);
}
@Test (groups="sell")
public void TC05() {
	Reporter.log("TC05 executed", true);
}

}
