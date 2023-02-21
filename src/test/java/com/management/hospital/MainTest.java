package com.management.hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A simple unit test
 */
public class MainTest 
{

	@Test
	public void test() {
		int result = Menu.readChoice();
		assertEquals(1, result);
	}
}
