package com.v2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name="StockInfo")
public class StockInfo  {
	@Id
	private int stockId;
	@Column(name="stockName")
	private String stockName;
	@Column(name="prize")
	private Double prize;
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	} 

}
