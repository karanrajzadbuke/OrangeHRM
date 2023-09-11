package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPriority      //This program is to indicate the priority of the annotations used ion TestNG
{
	@BeforeSuite
	public void m1()
	{
		System.out.println("This is before suite");
	}
	
	@AfterSuite
	public void m2()
	{
		System.out.println("This is after suite");
	}
	
	@BeforeTest
	public void m3()
	{
		System.out.println("This is before test");
	}
	
	@AfterTest
	public void m4()
	{
		System.out.println("This is after test");
	}
	
	@BeforeClass
	public void m5()
	{
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void m6()
	{
		System.out.println("This is after class");
	}
	
	@BeforeMethod
	public void m7()
	{
		System.out.println("This is before methosd");
	}
	
	@AfterMethod
	public void m8()
	{
		System.out.println("This is after method");
	}
	
	@Test
	public void t1()
	{
		System.out.println("This is test 1");
	}
	
	@Test
	public void t2()
	{
		System.out.println("This is test 2");
	}
	



}
