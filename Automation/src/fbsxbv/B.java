package fbsxbv;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	@Test
	public void TC04() {
		Reporter.log("TC04", true);
	}
	@Test(timeOut=1000)
	public void TC05() throws InterruptedException {
		Reporter.log("TC05", true);
		Thread.sleep(2000);
		
	}
	@Test
	public void TC06() {
		boolean a = true;
		AssertJUnit.assertTrue(a);
		Reporter.log("Tc06", true);
	}

}
