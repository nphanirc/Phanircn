package com.qa.test;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class Basictest {

	@BeforeTest
	
	public void Btest() {
		System.out.println("Before test excutes before every test");
	}
	
	@Test
	
	public void Add() {
		
		int a=10; int b=20;
		Assert.assertEquals(30, a+b);
	
		System.out.println("The sum of 2 numbers is :" +(a+b));
	}
	
	@AfterTest
	
	public void Atest() {
		System.out.println("After test excutes after every test");
	}
	
	
}
