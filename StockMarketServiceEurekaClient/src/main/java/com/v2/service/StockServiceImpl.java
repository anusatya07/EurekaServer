package com.v2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2.model.StockInfo;
import com.v2.repo.StockRepo;

@Service
public class StockServiceImpl implements Stockservice{

	@Autowired
	private StockRepo repo;
	
	@Override
	public Double getStockInfoByName(String stockName, int quantity) {
		Double totalPrize = 0.0;
		StockInfo stockInfo = repo.findByStockName(stockName);
		Double prize = stockInfo.getPrize();
		if (prize != null) {
			totalPrize = prize * quantity;
		}
		return totalPrize;
	}

	@Override
	public StockInfo saveStock(StockInfo stockInfo) {
		return repo.save(stockInfo);
	}
	
	
}
