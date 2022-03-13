package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=1)
	public void TC01() {
		System.out.println("TC01");
	}
	@Test
	public void TC04() {
		System.out.println("TC04");
	}
	@Test(enabled=false)
	public void TC07() {
		System.out.println("TC07");
	}
	@Test(invocationCount=2, priority=-2)
	public void TC08() {
		System.out.println("TC08");
	}
	
	@BeforeMethod
	public void TC02() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void TC03() {
		System.out.println("After Method");
	}
	@BeforeClass
	public void TC05() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void TC06() {
		System.out.println("After Class");
	}
}