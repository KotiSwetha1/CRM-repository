package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalizer {
	@Test(retryAnalyzer=genericUtility.RetryAnalizerImplementation.class)
	public void retryanalizer()
	{   Assert.fail();
		System.out.println("hello");
	}

}
