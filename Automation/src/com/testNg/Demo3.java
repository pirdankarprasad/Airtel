package com.testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void Login() {
		Reporter.log("Login is successful", true);
		Assert.fail();
	}
	@Test(dependsOnMethods="Login")
	public void Logout() {
		Reporter.log("Logout is successful", true);
	}

}
