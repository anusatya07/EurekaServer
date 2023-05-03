package com.v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@GetMapping("/getStock")
	public int getPrize() {
		return 123;
		
	}

}
