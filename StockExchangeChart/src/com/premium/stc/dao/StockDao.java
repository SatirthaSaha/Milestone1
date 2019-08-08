package com.premium.stc.dao;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Stock;

public interface StockDao {

	public  boolean insertStock(Stock stock) throws SQLException;
	public Stock updateStock(Stock stock) throws SQLException;
	public List<Stock> getAllStock() throws SQLException, Exception;
	
}
