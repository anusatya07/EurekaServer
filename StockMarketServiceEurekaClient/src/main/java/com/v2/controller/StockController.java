package com.v2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2.model.StockInfo;
import com.v2.service.Stockservice;

@RestController
public class StockController {
	
	@Autowired
	private Stockservice service;
	
	@GetMapping("/calculate/{stockName}/{quantity}")
	public ResponseEntity<Double> getTotalePrize(@PathVariable String stockName,@PathVariable int quantity) {
		Double totalPrize=service.getStockInfoByName(stockName, quantity);
		return new ResponseEntity<>(totalPrize,HttpStatus.OK);
	}
	
	@PostMapping("stock")
	public ResponseEntity<StockInfo> saveStock(@RequestBody StockInfo stockInfo) {
		StockInfo stockInfoData = service.saveStock(stockInfo);
		return new ResponseEntity<>(stockInfoData, HttpStatus.CREATED);
	}

}
