package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.dao.StockDao;
import com.premium.stc.dao.StockDaoImpl;
import com.premium.stc.model.Stock;

public class StockServiceImpl implements StockService{
	
	private StockDao stockDao= new StockDaoImpl();

	@Override
	public boolean insertStock(Stock stock) throws SQLException {
		// TODO Auto-generated method stub
		return stockDao.insertStock(stock);
	}

	@Override
	public Stock updateStock(Stock stock) throws SQLException {
		// TODO Auto-generated method stub
		return stockDao.updateStock(stock);
	}

	@Override
	public List<Stock> getAllStock() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return stockDao.getAllStock();
	}

}
