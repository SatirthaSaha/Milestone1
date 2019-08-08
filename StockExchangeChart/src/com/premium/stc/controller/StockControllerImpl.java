package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Stock;
import com.premium.stc.service.StockService;
import com.premium.stc.service.StockServiceImpl;

public class StockControllerImpl implements StockController{

	private StockService stockService=new StockServiceImpl();
	@Override
	public boolean insertStock(Stock stock) throws SQLException {
		// TODO Auto-generated method stub
		return stockService.insertStock(stock);
	}

	@Override
	public Stock updateStock(Stock stock) throws SQLException {
		// TODO Auto-generated method stub
		return stockService.updateStock(stock);
	}

	@Override
	public List<Stock> getAllStock() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return stockService.getAllStock();
	}

}
