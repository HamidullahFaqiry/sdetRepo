package tests;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestNGConcepts {
	
	
	@Test
	public void signIn() {
		String a = "school";
		String b = "collage";
		Assert.assertEquals(a, b);
	}
	
	@Test (dependsOnMethods = {"signIn"})
	public void homePage() {
		System.out.println("This test is depended on the Sign in test cases");
	}
	
	@Test (invocationCount = 10)
	public void checkTitle() {
		System.out.println("this test case will run 10 times");
	}
	
	@Test (groups = {"smokeTest"})
	public void logout() {
		System.out.println("Log out test");
	}
	
	@Test (groups = {"smokeTest"})
	public void dashboard() {
		System.out.println("dashboard test");
	}
	
	@Test (groups = {"smokeTest"})
	public void customerPage() {
		System.out.println("customer page test");
	}

}
