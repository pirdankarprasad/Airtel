package com.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void HardAssert() {  //pass
		String str1= "Hello";
		String str2= "Hello";
		Assert.assertEquals(str1, str2);
	}
@Test
public void Assert2() {    //fail
	String str1="Hello";
	String str2="Hello";
	Assert.assertNotEquals(str1, str2);
}
@Test 
public void Assert3() {          //pass
	boolean str1 = true;
	
	Assert.assertTrue(str1);
}
@Test
public void Assert4() {   //fail
	boolean str1=true;
	Assert.assertFalse(str1);
}
@Test
public void Assert5() {         //fail
String str= "String";
Assert.assertNull(str);
}
@Test                             
public void Assert6() {         //pass
	String str="String";
	Assert.assertNotNull(str);
}
}
