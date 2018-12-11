package com.medievalgrosbill;

import static org.junit.Assert.assertTrue;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {

	@Before(value = "")
	public void setup() {
		System.out.println("setup");
	}
	
	@Test
	public void test1() {
		assertTrue(true);
		System.out.println("test1");
	}
}
