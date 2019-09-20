package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassAfterClass {
	//To stop this @test annotation from running, we write @Ignore before @Test
	//	@Ignore  
		@Test
		public void signUp() { //start
			System.out.println("Executing @Test annotation");
			System.out.println("I am Test Case #1");
		} //End 
		/*This @Test annotation will be excluded from Execution 
		 Also @BeforeClass & @AfterClass annotations will run for the @test annotation which is containing static methods  */
		
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
		
		@BeforeClass
		public static void Exec() {
			System.out.println("This is the @BeforeClass annotation");
			
		}
		
		@AfterClass
		public static void Terminate() {
			System.out.println("This is the @AfterCLass annotation");
		}
		
		

}
