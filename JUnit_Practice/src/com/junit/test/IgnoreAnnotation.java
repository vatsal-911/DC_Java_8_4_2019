package com.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreAnnotation {

	//To stop this @test annotation from running, we write @Ignore before @Test
	@Ignore  
	@Test
	public void signUp() { //start
		System.out.println("Executing @Test annotation");
		System.out.println("I am Test Case #1");
	} //End 
	/*This @Test annotation will be excluded from Execution 
	 Also @Before & @After annotations wont run for the @test annotation which is not  */
	
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
