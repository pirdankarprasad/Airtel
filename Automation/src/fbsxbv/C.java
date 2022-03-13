package fbsxbv;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C {
@Test
public void TC07() {
	SoftAssert ast=new SoftAssert();
	int a=10;
	int b=20;
	ast.assertEquals(a, b);
}
@Test
public void TC08() {
	SoftAssert ast=new SoftAssert();
	String a=null;
	ast.assertNotNull(a);
}
}
