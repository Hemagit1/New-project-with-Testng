package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import org.testng.annotations.Test;


public class day1 {
	
	
	public void demo()
	{
		System.out.println("hello");
	}

	public void demo2()
	{
		System.out.println("hello2");
	}
	
	@AfterSuite
	public void after()
	{
		System.out.println("aftersuite");
		
	}
	
	
}

