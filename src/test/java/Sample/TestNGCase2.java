package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGCase2 {
	@Test(priority=1,dependsOnMethods= {"modifyUser","deleteUser"})
	public void createUser()
	
	{System.out.println("user created");
		
	}
	@Test(priority=3,invocationCount=3)
	public void modifyUser()
	{
		System.out.println("modifyUser created");
	}
	@Test(priority=2)//,dependsOnMethods={"createUser"})
	public void deleteUser()
	{
		System.out.println("uder deleted");
	}
	@Ignore
	@Test(priority=4,invocationCount=4)
	public void Login()
	{
		System.out.println("login oparation is done");
	}

}
