package com.example.SSPR;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class Sspr4ApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void test1() {
		assertTrue("", 3==3);
	}

	@Test
	void test2() {
		assertTrue("", 1==1);
	}

	@Test
	void test3() {
		assertTrue("", 2==2);
	}
	@Test
	void testF() {
		assertTrue("", true);
	}
}
