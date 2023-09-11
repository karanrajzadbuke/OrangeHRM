package dependenciesInTestNG;

import org.testng.annotations.Test;

public class DependsOnSingleTestMethodExample 
{
	@Test(dependsOnMethods = "myTestB")
	public void myTestA()
	{
		System.out.println("I am in myTetstA");
	}
	
	@Test
	public void myTestB()
	{
		System.out.println("I am in myTetstB");
	}
	
	@Test(dependsOnGroups = "MyTestD")
	public void myTestC()
	{
		System.out.println("I am in myTetstC");
	}
	
	@Test
	public void myTestD()
	{
		System.out.println("I am in myTetstD");
	}


}
