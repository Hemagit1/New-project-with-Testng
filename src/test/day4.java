package test;

import org.testng.annotations.Test;

public class day4 {

	@Test(dependsOnMethods = {"method2","method3"})
	public void method1()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Hello2");

	}
	
	@Test(timeOut=4000)
	public void method3()
	{
		System.out.println("Hello3");
	}
	
	@Test(enabled=true)
	public void method4()
	{
		System.out.println("Hello4");

	}
	
}

