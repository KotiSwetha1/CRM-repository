package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertion {
	@Test
	public void StrictLevelSoftAssertion()
	{
		String expectedvalue="Raam";
		String actualvalue="Raam";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualvalue ,expectedvalue);
		System.out.println("validation done");
		s.assertAll();
		
	}
	@Test
	public void ContainsLevelComparitonSoftAssert()
	{
		String expectedvalue="don";
		String actualvalue="Done";
		SoftAssert s=new SoftAssert();
		s.assertFalse(actualvalue.contains(expectedvalue));
		s.assertAll();
		System.out.println("validation done");
		
	}

}
