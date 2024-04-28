package com.project.simple;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SimpleApplication.class)
class SimpleApplicationTests {

	@Autowired
	private Text text;

	@Test
	void palindromeTest() {
		assertTrue(text.isPalindrome(""));
		assertTrue(text.isPalindrome("kasurrusak"));
	}

}