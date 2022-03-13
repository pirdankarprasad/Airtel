package fbsxbv;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void TC01() {
		Reporter.log("TC01",true);
	}
	@Test(priority=-1)
	public void TC02() {
		String a="Hello";
		String b="Hello";
		AssertJUnit.assertEquals(a, b);
		Reporter.log("TC02", true);
	}
	@Test(invocationCount=2)
	public void TC03() {
		String a="Hello";
		Assert.assertNull(a);
		Reporter.log("TC03",true);
	}

}
