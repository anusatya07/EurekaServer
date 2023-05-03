package com.v2.service;

import com.v2.model.StockInfo;

public interface Stockservice {
	
	public Double getStockInfoByName(String stockName, int quantity);

	public StockInfo saveStock(StockInfo stockInfo);

}
