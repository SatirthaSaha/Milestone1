package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyDao {
	  public boolean insertCompany(Company company) throws SQLException;
	    public boolean updateCompany(Company company) throws SQLException;
		public List<Company> getCompanyList() throws SQLException;

}
