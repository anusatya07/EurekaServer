package com.v2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2.model.StockInfo;

public interface StockRepo extends JpaRepository<StockInfo, Integer> {
	
	public StockInfo findByStockName(String name);

}
