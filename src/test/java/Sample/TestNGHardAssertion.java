package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertion {
	@Test
	public void strictLevelComoarition()
	{
		String expectedvalue="Ram";
		String actualvalue="Ram";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("validation done");
	}
	@Test
	public void ContainsLevelComparition()
	{
		String expectedvalue="don";
		String actualvalue="london";
		Assert.assertTrue(actualvalue.contains(expectedvalue));
		System.out.println("validation done");
	}

}
