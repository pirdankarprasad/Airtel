package testcases;



import org.testng.Assert;

import org.testng.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TC01 {
	String TcId;
	@BeforeMethod
	public void driver() {
		
		System.out.println("Before  class");
	}
	@Test
	public void TC01() {
		Reporter.log("Tc01 executed");
		 TcId="Tc01";
		Assert.fail();
	}
	
		
	
	
	
}
