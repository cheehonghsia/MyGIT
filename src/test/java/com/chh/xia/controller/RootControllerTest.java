package com.chh.xia.controller;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.chh.xia.calculateservice.CalculateService;

public class RootControllerTest {

	@Test
	public void testAddingFunctionality() {
		RootController controller = new RootController();
		int result = controller.someLogic(1, 2);
		CalculateService calculateService = mock(CalculateService.class);
		when(calculateService.addTwoNumbers(1, 2)).thenReturn(3);
		assertTrue(result == 30);
	}
}
