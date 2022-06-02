package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day3 {
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I am before class");
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
		
	}
	@Test()
	public void first()
	{
		System.out.println("i will execute last");
		
	}
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("beforesuite");
		
	}
	
	@Test(groups= {"smoke"})
	public void weblogin()
	{
		System.out.println("web");
		
	}
	

	@Test
	public void mobilelogin()
	{
		System.out.println("mobile");
		
	}
	

	@Test
	public void Apimobileapi()
	{
		System.out.println("appium");
		
	}
	
	@Test
	public void Apimob()
	{
		System.out.println("appium2");
		
	}
	
}

