package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.model.Company;

public interface CompanyController {

	public Company insertCompany(Company company) throws SQLException;
	public Company updateCompany(Company company);
	public List<Company> getCompanyList() throws Exception;
}
