package com.medievalgrosbill;

import org.aspectj.lang.annotation.Before;

//@SpringBootTest
public class BaseTest {

	@Before(value = "")
	public void setup() {
		System.out.println("setup");
	}
	
//	@Test
//	public void test1() {
//		assertTrue(true);
//		System.out.println("test1");
//	}
}
