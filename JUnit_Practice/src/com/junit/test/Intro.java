package com.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Intro {
	
	@Test
	public void signUp() {
		System.out.println("Executing @Test annotation");
		System.out.println("I am Test Case #1");
	}
	
	@Before
	public void login() {
		System.out.println("Executing @Before annotation");
	}
	
	@After
	public void register() {
		System.out.println("Executing @After annotation");
	}
	
	@Test
	public void runner() {
		System.out.println("Executing 2nd Test annotation");
		System.out.println("I am Test Case #2");
	}
	
	@Test
	public void execute() {
		System.out.println("Executing 3rd Test annotation");
		System.out.println("I am Test Case #3");
	}
	

}
