package com.premium.stc.dao;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Company;

public interface CompanyDao {

	public boolean insertCompany(Company company) throws SQLException;
	public boolean updateCompany(Company company) throws SQLException;
	public List<Company> getCompanyList() throws SQLException, Exception;
}
