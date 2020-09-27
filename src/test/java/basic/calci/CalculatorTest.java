package org.simplilearn.basic.calci;
import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest {

	public void testAdd()
	{
		Calculator calculator= new Calculator();
		int sum= calculator.add(20,10);
		Assert.assertEquals(30,sum);
	}

}
