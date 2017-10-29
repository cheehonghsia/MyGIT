package com.chh.xia.controller;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;

import com.chh.xia.calculateservice.CalculateService;

public class RootControllerTest {
	
	private static RootController root;
	private static CalculateService calculateService;

	@BeforeClass
	public static void initiateCalculateService() {
		root = new RootController();
		calculateService = mock(CalculateService.class);
		when(calculateService.addTwoNumbers(1, 2)).thenReturn(3);
	}

	@Test
	public void testAddingFunctionality() {
		int result = root.someLogic(1, 2);
		assertTrue(result == 30);
	}
}
