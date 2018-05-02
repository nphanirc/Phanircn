package com.qa.test;

import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.runner.RunWith;

public class Junit_test {
	
	

	@Test(expected=Exception.class)
	
	public void junit_test() {
		String s = "working on junit";
		
		assertEquals(5,6);
		
	}
	



}
