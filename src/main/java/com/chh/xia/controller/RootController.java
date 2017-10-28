package com.chh.xia.controller;

import com.chh.xia.calculateservice.CalculateService;
import com.chh.xia.calculateservice.CalculateServiceImpl;

public class RootController {

	private CalculateService calculateService;

	public RootController() {
		this.calculateService = new CalculateServiceImpl();
	}

	public int someLogic(int first, int second) {
		int result = this.calculateService.addTwoNumbers(first, second);
		return result * 10;
	}

}
