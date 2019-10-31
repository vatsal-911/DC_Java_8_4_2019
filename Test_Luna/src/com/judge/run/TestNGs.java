package com.judge.run;

import org.testng.annotations.Test;

public class TestNGs {

	@Test
	public void SignI() {
		System.out.println("S");
	}
	
	@Test(dependsOnMethods = "Asc")
	public void Redo() {
		System.out.println("R");
	}
	
	@Test
	public void AsC() {
		System.out.println("A");
	}
	
	@Test
	public void Benign() {
		System.out.println("B");
	}
	
	@Test
	public void as3() {
		System.out.println("small a");
	}
	
	@Test
	public void darrius() {
		System.out.println("small d");
	}
	
	
}
